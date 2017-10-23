package C02_Executors.ParallelCoarseGrained;

import C02_Executors.Distance;
import C02_Executors.Sample;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class KnnClassifierParallelGroup {

    private List<? extends Sample> dataSet;
    private int k;
    private ThreadPoolExecutor executor;
    private int numThreads;
    private int samplesForEachThread;

    public KnnClassifierParallelGroup(List<? extends Sample> dataSEt, int k) {
        this.dataSet = dataSEt;
        this.k = k;
        numThreads = Runtime.getRuntime().availableProcessors();
        executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(numThreads);
        samplesForEachThread = dataSet.size()/numThreads;
    }

    public String classify(Sample sample) throws InterruptedException {
        Distance[] distance = getDistances(sample);
        Arrays.parallelSort(distance);
        return GetBestTag(distance);
    }

    private Distance[] getDistances(Sample sample) throws InterruptedException {
        Distance[] distance = new Distance[dataSet.size()];
        CountDownLatch endController=new CountDownLatch(numThreads);
        int start=0;
        int stop= samplesForEachThread;
        for (int x=0; x<numThreads; x++){
            GroupDistanceTask gdt = new GroupDistanceTask(distance,
                                                        start,
                                                        stop,
                                                        dataSet,
                                                        sample,
                                                        endController);
            executor.execute(gdt);
            start=stop;
            if ((x+2)<numThreads)
                stop=stop+ samplesForEachThread;
            else
                stop=dataSet.size();
        }
        endController.await();
        return distance;
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
}