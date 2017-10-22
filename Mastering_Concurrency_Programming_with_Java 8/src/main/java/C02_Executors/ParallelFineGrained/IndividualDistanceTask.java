package C02_Executors.ParallelFineGrained;

import C02_Executors.Distance;
import C02_Executors.EuclideanDistanceCalculator;
import C02_Executors.Sample;

import java.util.concurrent.CountDownLatch;

public class IndividualDistanceTask implements Runnable{
    private final Distance[] distances;
    private final int index;
    private final Sample localExample;
    private final Sample example;
    private final CountDownLatch endControler;

    public IndividualDistanceTask(Distance[] distances,
                                  int index,
                                  Sample localExample,
                                  Sample example,
                                  CountDownLatch endControler) {
        this.distances = distances;
        this.index = index;
        this.localExample = localExample;
        this.example = example;
        this.endControler = endControler;
    }

    @Override
    public void run() {
        distances[index] = new Distance();
        distances[index].setIndex(index);
        distances[index].setDistance(EuclideanDistanceCalculator.calculate(example, localExample));
        endControler.countDown();
    }
}