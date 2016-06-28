
public class MatrixRotate {
	public static void main(String args[]){
		int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		rotateC(matrix);
		System.out.println("Clockwise: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		rotateAC(matrix);
		System.out.println("Anti-Clockwise: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotateC(int[][] matrix){
		int length=matrix.length;
		for(int layer=0;layer<length/2;layer++){	
			int first=layer;
			int last=length-1-layer;
			for(int i=first;i<last;i++){
				int temp=matrix[first][first+i];
				matrix[first][first+i]=matrix[last-i][first];
				matrix[last-i][first]=matrix[last][last-i];
				matrix[last][last-i]=matrix[first+i][last];
				matrix[first+i][last]=temp;
			}
		}		
	}
	public static void rotateAC(int[][] matrix){
		int length=matrix.length;
		for(int layer=0;layer<length/2;layer++){	
			int first=layer;
			int last=length-1-layer;
			for(int i=first;i<last;i++){
				int temp=matrix[first][first+i];
				matrix[first][first+i]=matrix[first+i][last];
				matrix[first+i][last]=matrix[last][last-i];
				matrix[last][last-i]=matrix[last-i][first];
				matrix[last-i][first]=temp;
			}
		}	
	}
}
