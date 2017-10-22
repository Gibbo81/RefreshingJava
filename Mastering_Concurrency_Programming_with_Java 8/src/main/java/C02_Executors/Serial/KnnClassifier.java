package C02_Executors.Serial;

import C02_Executors.Distance;
import C02_Executors.EuclideanDistanceCalculator;
import C02_Executors.Sample;

import java.util.*;

public class KnnClassifier {

    private List<? extends Sample> dataSet;
    private int k;

    public KnnClassifier(List<? extends Sample> dataSet, int k) {
        this.dataSet = dataSet;
        this.k = k;
    }

    public String classify(Sample example){
        Distance[] distances = CalculateDistances(example);
        Arrays.sort(distances);
        return GetBestTag(distances);
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

    private Distance[] CalculateDistances(Sample example) {
        Distance[] distances = new Distance[dataSet.size()];
        int index =0;
        for (Sample x : dataSet){
            distances[index]= new Distance();
            distances[index].setIndex(index);
            distances[index].setDistance(EuclideanDistanceCalculator.calculate(example, x));
            index++;
        }
        return distances;
    }
}