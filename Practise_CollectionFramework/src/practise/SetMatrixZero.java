package practise;

public class SetMatrixZero {
	    public static void zeroMatrix(int[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;

	        boolean[] rowZero = new boolean[m];
	        boolean[] colZero = new boolean[n];
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (matrix[i][j] == 0) {
	                    rowZero[i] = true;
	                    colZero[j] = true;
	                }
	            }
	        }
	        
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (rowZero[i] || colZero[j]) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int cell : row) {
	                System.out.print(cell + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 0, 6},
	            {7, 8, 9}
	        };

	        zeroMatrix(matrix);
	        printMatrix(matrix);
	    }
	}

