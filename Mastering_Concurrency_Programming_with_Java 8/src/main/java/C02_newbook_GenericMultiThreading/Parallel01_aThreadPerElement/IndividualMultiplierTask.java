package C02_newbook_GenericMultiThreading.Parallel01_aThreadPerElement;


public class IndividualMultiplierTask implements Runnable {

    private double[][] matrix1;
    private double[][] matrix2;
    private double[][] result;
    private int row;
    private int column;

    public IndividualMultiplierTask(double[][] matrix1,
                                    double[][] matrix2,
                                    double[][] result,
                                    int elementrow,
                                    int elementcolumn) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
        this.row = elementrow;
        this.column = elementcolumn;
    }

    @Override
    public void run() {
        result[row][column] = 0;
        for (int k = 0; k < matrix1[row].length; k++) {
            result[row][column] += matrix1[row][k] * matrix2[k][column];
        }
    }
}
