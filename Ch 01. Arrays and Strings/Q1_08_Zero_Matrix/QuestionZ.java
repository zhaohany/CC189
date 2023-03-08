package Q1_08_Zero_Matrix;

import CtCILibrary.AssortedMethods;

public class QuestionZ {
	public void setZeros(int[][] matrix) {
		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];

		for (int i = 0; i< matrix.length; i++){
			for (int j = 0; j< matrix[0].length; j++){
				if(matrix[i][j] == 0){
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int r = 0; r< rows.length; r++ ){
			if (rows[r]){
				setrows(r,matrix);
			}
		}

		for (int c = 0; c<cols.length; c++){
			if(cols[c]){
				setcols(c,matrix);
			}
		}
		return;

	}
	public void setrows(int r, int[][] matrix){
		for (int o = 0; o<matrix[0].length;o++){
			matrix[r][o] = 0;
		}
		return;
	}

	public void setcols(int c, int[][] matrix){
		for (int h = 0; h<matrix.length;h++){
			matrix[h][c] = 0;
		}
		return;
	}
	public static void main(String[] args) {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);		

		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);
	}
}
