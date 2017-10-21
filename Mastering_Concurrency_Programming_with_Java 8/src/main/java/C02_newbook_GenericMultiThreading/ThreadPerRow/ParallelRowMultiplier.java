package C02_newbook_GenericMultiThreading.ThreadPerRow;

import java.util.ArrayList;
import java.util.List;

public class ParallelRowMultiplier {

    private int parallellevel;

    public ParallelRowMultiplier(int parallellevel) {
        this.parallellevel = parallellevel;
    }

    public void multiply(double[][] matrix1,
                         double[][] matrix2,
                         double[][] result) throws InterruptedException {

        List<Thread> list = new ArrayList<Thread>();
        for (int n =0; n<matrix1.length; n++){
            Thread t = new Thread(new RowMultiplierTask(matrix1,matrix2,result,n));
            t.start();
            list.add(t);
            CheckParallelLevel(list);
        }
    }

    private void CheckParallelLevel(List<Thread> list) throws InterruptedException {
        if (list.size()==parallellevel){
            for (Thread i : list)
                i.join();
            list.clear();
        }
    }
}