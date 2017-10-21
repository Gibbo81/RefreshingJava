package C02_newbook_GenericMultiThreading.Parallel01_aThreadPerElement;


import java.util.ArrayList;
import java.util.List;

public class ParallelIndividualMultiplier {

    private int parallellevel;

    public ParallelIndividualMultiplier(int parallellevel) {
        this.parallellevel = parallellevel;
    }

    public void multiply(double[][] matrix1,
                          double[][] matrix2,
                          double[][] result) throws InterruptedException {

        List<Thread> list = new ArrayList<Thread>();

        for (int row =0; row< result.length; row++)
            for (int column =0; column< result[0].length; column++){
                IndividualMultiplierTask imt = new IndividualMultiplierTask(matrix1,matrix2,result,row,column);
                Thread t = new Thread(imt);
                t.start();
                list.add(t);
                if (list.size()==parallellevel){
                    for(Thread x : list){
                        x.join();
                    }
                    list.clear();
                }
            }
    }
}