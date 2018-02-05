package Ch_01_Array_And_Strings.Q1_08_Zero_Matrix;


import CtCILibrary.CtCILibrary.AssortedMethods;

public class QuestionA {

	public static void setZeros(int[][] matrix) {
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
