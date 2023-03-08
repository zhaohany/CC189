package Q1_07_Rotate_Matrix;

import CtCILibrary.AssortedMethods;

public class QuestionZ {

	public static boolean rotate(int[][] matrix) {
		int n = matrix.length;
		int l = 0;
		int r = n-1;
		while(l<r){
			for(int i =0; i<r-l; i++){
				int t = l;
				int b = r;
				int top = matrix[t][l+i];
				matrix[t][l+i] = matrix[b-i][l];
				matrix[b-i][l] = matrix[b][r-i];
				matrix[b][r-i] = matrix[t+i][r];
				matrix[t+i][r] = top;
			}
			l++;
			r--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}
}
