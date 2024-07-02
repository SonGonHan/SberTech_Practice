public class Main {
    public static void main(String[] args) throws Exception {
        int N = 3, M = 2;
        Matrix matrix1 = new Matrix(N, M);
        Matrix matrix2 = new Matrix(N, M);
        Matrix matrix3 = new Matrix(M, N);
        for (int i = 0; i < N; ++i){
            for (int j = 0; j < M; ++j) {
                matrix1.setValue(i, j, (int)(Math.random() * 10));
                matrix2.setValue(i, j, (int)(Math.random() * 10));
                matrix3.setValue(j, i, (int)(Math.random() * 10));
            }
        }
        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrix3);

        matrix2.multiplicationWithNumber(-1);
        System.out.println(matrix2);

        matrix1.addiction(matrix2);
        System.out.println(matrix1);

        matrix1.multiplication(matrix3);
        System.out.println(matrix1);

        matrix1.multiplication(matrix2);
    }
}
