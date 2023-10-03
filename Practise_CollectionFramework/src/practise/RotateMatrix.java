package practise;

public class RotateMatrix {
	public static void rotate(int[][]matrix) {
		int n=matrix.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=temp;
			}
		}
	}
	
	public static void printMatrix(int[][]matrix) {
		for(int[] row:matrix) {
			for(int cell:row) {
				System.out.print(cell+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		int[][]matrix= {
				{1,2,3},
				{3,6,7},
				{3,5,4}
		};
		rotate(matrix);
		printMatrix(matrix);
	}

}
