package C02_Executors.ParallelCoarseGrained;

import C02_Executors.Distance;
import C02_Executors.EuclideanDistanceCalculator;
import C02_Executors.Sample;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class GroupDistanceTask implements Runnable {

    private final Distance[] distances;
    private final int startIndex;
    private final int endIndex;
    private List<? extends Sample> dataSet;
    private final Sample sampleToAnalize;
    private final CountDownLatch endControler;

    public GroupDistanceTask(Distance[] distances,
                             int startIndex,
                             int endIndex,
                             List<? extends Sample> dataSet,
                             Sample example,
                             CountDownLatch endControler) {
        this.distances = distances;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.dataSet = dataSet;
        this.sampleToAnalize = example;
        this.endControler = endControler;
    }

    @Override
    public void run() {
        for (int x=startIndex; x<endIndex; x++){
            distances[x] = new Distance();
            distances[x].setIndex(x);
            distances[x].setDistance(EuclideanDistanceCalculator.calculate(sampleToAnalize,
                                                                           dataSet.get(x)));
            endControler.countDown();
        }
    }
}


