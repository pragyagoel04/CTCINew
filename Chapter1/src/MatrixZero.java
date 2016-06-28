
public class MatrixZero {
	public static void main(String args[]){
		int matrix[][]={{1,2,0},{4,0,6},{7,8,9}};
		System.out.println("Original matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
		setZeros(matrix);
	}
	
	public static void setZeros(int[][] matrix){
		boolean row[]= new boolean[matrix.length];
		boolean column[]= new boolean[matrix.length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				if(row[i] || column[j]){
					matrix[i][j]=0;
				}
			}
		}
		
		System.out.println("After setting zeros");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
