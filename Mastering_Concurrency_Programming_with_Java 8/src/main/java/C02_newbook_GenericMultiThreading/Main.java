package C02_newbook_GenericMultiThreading;

import C02_newbook_GenericMultiThreading.Parallel01_aThreadPerElement.ParallelIndividualMultiplier;
import C02_newbook_GenericMultiThreading.ThreadPerRow.ParallelRowMultiplier;
import C02_newbook_GenericMultiThreading.ThreadPerRow.RowMultiplierTask;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        double matrix1[][] = MatrixGenerator.generate(800, 800);
        double matrix2[][] = MatrixGenerator.generate(800, 800);
        double resultSerial[][]= new double[matrix1.length]
                [matrix2[0].length];

        Date start=new Date();
        SerialMultiplier.multiply(matrix1, matrix2, resultSerial);
        Date end=new Date();
        System.out.printf("Serial: %d%n",end.getTime()-start.getTime());

        /*
        ParallelIndividualMultiplier p1 = new ParallelIndividualMultiplier(4);
        resultSerial= new double[matrix1.length][matrix2[0].length];
        start=new Date();
        p1.multiply(matrix1, matrix2, resultSerial);
        end=new Date();
        System.out.printf("Parallel type 1 whith 4 thread: %d%n",end.getTime()-start.getTime());
*/
        int numThreads=Runtime.getRuntime().availableProcessors();
        ParallelRowMultiplier p2 = new ParallelRowMultiplier(numThreads);
        resultSerial= new double[matrix1.length][matrix2[0].length];
        start=new Date();
        p2.multiply(matrix1, matrix2, resultSerial);
        end=new Date();
        System.out.printf("Parallel for row with %s thread: %d%n",numThreads,end.getTime()-start.getTime());


    }
}
