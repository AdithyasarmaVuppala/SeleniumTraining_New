package Assignments.April03_2026;

public class Assignment_MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,1,2,3}};
		int[][] matrix2 = {{4,3,2,1},{8,7,6,5},{3,2,1,0}};
		
		int rows=matrix1.length;
		int col = matrix1[0].length;
		int [][] matrix3 = new int[rows][col];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<rows;i++) {
			for (int j=0;j<col;j++) {
				  matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
				  if (matrix3[i][j] > max) {
	                    max = matrix3[i][j];
			}
		}
		}
		for(int i=0;i<rows;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		 System.out.println("Maximum element in the result matrix: " + max);
		}
	}

	
