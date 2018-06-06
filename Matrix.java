public class Matrix {
	public static void main (String args []){
	

	int [] iArray1;
	int [] iArray2;
	final int rowCount = firstMatrix.length;             // Число строк результирующей матрицы.
    final int colCount = secondMatrix[0].length; 
	

	}
	private static int[][] multiplyMatrix( int[][] firstMatrix,
                                           int[][] secondMatrix)
    {
        // Число столбцов результирующей матрицы.
         int sumLength = secondMatrix.length;           // Число членов суммы при вычислении значения ячейки.
         int[][] result = new int[rowCount][colCount];  // Результирующая матрица.

        for (int row = 0; row < rowCount; ++row) {  // Цикл по строкам матрицы.
            for (int col = 0; col < colCount; ++col) {  // Цикл по столбцам матрицы.
                int sum = 0;
                for (int i = 0; i < sumLength; ++i)
                    sum += firstMatrix[row][i] * secondMatrix[i][col];
                result[row][col] = sum;
            }
        }

        return result;
    }
}