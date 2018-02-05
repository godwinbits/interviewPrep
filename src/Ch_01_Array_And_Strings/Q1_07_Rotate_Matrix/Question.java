package Ch_01_Array_And_Strings.Q1_07_Rotate_Matrix;

import CtCILibrary.CtCILibrary.AssortedMethods;

public class Question {

	public static boolean rotate(int[][] matrix) {
		System.out.print("Not implemented");
		return false;
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
