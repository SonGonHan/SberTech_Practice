

public class Matrix {

    private int cols, rows;
    private int[][] matrix;

    public Matrix(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
        matrix = new int[rows][cols];
    }

    public void setValue(int i, int j, int value) {
        try{
            matrix[i][j] = value;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getValue(int i, int j) {
        try{
            return matrix[i][j];
        }
        catch(Exception e){
            throw e;
        }
    }

    Exception SizeError = new Exception("Недопустимые размеры матриц");

    public void addiction(Matrix anotherMatrix) throws Exception {
        if (rows != anotherMatrix.getRows() || cols != anotherMatrix.getCols()) {
            throw SizeError;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] += anotherMatrix.getValue(i, j);
            }
        }
    }

    public void multiplicationWithNumber(int num) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= num;
            }
        }
    }

    public void multiplication(Matrix anotherMatrix) throws Exception {
        if (rows != anotherMatrix.getCols() || cols != anotherMatrix.getRows()) {
            throw SizeError;
        }
        cols = anotherMatrix.getCols();
        int[][] newMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < anotherMatrix.getRows(); k++) {
                    sum += matrix[i][k] * anotherMatrix.getValue(k, j);
                }
                newMatrix[i][j] = sum;
            }
        }
        matrix = newMatrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
