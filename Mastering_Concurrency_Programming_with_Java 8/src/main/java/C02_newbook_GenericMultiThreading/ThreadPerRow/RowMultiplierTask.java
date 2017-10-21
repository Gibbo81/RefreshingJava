package C02_newbook_GenericMultiThreading.ThreadPerRow;

public class RowMultiplierTask implements Runnable {

    private double[][] matrix1;
    private double[][] matrix2;
    private double[][] result;
    private int row;

    public RowMultiplierTask(double[][] matrix1, double[][] matrix2, double[][] result, int row) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
        this.row = row;
    }

    public void run() {
        for (int n=0; n<matrix2[0].length; n++){
            result[row][n] = 0;
            for (int k = 0; k < matrix1[row].length; k++) {
                result[row][n] += matrix1[row][k] * matrix2[k][n];
            }
        }
    }
}
