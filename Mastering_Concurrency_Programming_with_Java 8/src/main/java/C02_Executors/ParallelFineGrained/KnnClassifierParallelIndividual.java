package C02_Executors.ParallelFineGrained;

import C02_Executors.Distance;
import C02_Executors.Sample;

import java.io.Closeable;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class KnnClassifierParallelIndividual implements Closeable {

    private List<? extends Sample> dataSet;
    private int k;
    private ThreadPoolExecutor executor;
    private int numThreads;


    public KnnClassifierParallelIndividual(List<? extends Sample> dataSEt,
                                           int k,
                                           int factor) {
        this.dataSet = dataSEt;
        this.k = k;
        numThreads = factor*Runtime.getRuntime().availableProcessors();
        executor=(ThreadPoolExecutor)Executors.newFixedThreadPool(numThreads);
    }

    public String classify(Sample example) throws Exception{
        Distance[] distances = getDistances(example);
        Arrays.parallelSort(distances);
        return GetBestTag(distances);
    }

    private Distance[] getDistances(Sample example) throws InterruptedException {
        Distance[] distances = new Distance[dataSet.size()];
        //CountDownLatch class. This class allows a thread to wait until other threads have
        // arrived at a determined point of their code. It's initialized with the number of
        // threads you want to wait for
        CountDownLatch endController=new CountDownLatch(dataSet.size());
        int index=0;
        for (Sample localExample : dataSet) {
            IndividualDistanceTask task=new IndividualDistanceTask( distances,
                                                                    index,
                                                                    localExample,
                                                                    example,
                                                                    endController);
            executor.execute(task);
            index++;
        }
        endController.await();
        return distances;
    }

    private String GetBestTag(Distance[] distances) {
        Map<String, Integer> results = new HashMap<>();
        for (int x=0; x<k; x++){
            Sample s = dataSet.get(distances[x].getIndex());
            String tag =  s.getTag();
            results.merge(tag, 1, (a, b) -> a+b);
        }
        return Collections.max(results.entrySet(),Map.Entry.comparingByValue()).getKey();
    }

    /**
     * Shutdown the executor calling its shutdown() method. It you don't call this method, your
     * application will never end because threads created by the executor are still alive and
     * waiting for the new tasks to do.
     */
    @Override
    public void close() throws IOException {
        if (!executor.isShutdown())
            executor.shutdown();
    }
}