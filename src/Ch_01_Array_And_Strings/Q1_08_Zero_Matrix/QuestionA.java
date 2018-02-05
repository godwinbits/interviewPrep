package Ch_01_Array_And_Strings.Q1_08_Zero_Matrix;


import CtCILibrary.CtCILibrary.AssortedMethods;
import java.util.*;

class IntegerPair{
	private int row;
	private int column;

	public IntegerPair(int rowIndex, int columnIndex){
		row = rowIndex;
		column = columnIndex;

	}

	public int getRow(){
		return row;
	}

	public int getColumn(){
		return column; 
	}
}


public class QuestionA {

	public static void setZeros(int[][] matrix) {

		Vector<IntegerPair> arrayIndex = new Vector<IntegerPair>();
		for (int i=0;i<matrix.length; i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j] == 0){
					IntegerPair index = new IntegerPair(i,j);
					arrayIndex.add(index);
				}
			}
		}

		for(int i=0;i<arrayIndex.size();i++){
			IntegerPair index = arrayIndex.get(i);
			int row = index.getRow();
			int column = index.getColumn();

			for (int j=0;j<matrix[row].length;j++){
				matrix[row][j] = 0;
			}
			for (int k=0;k<matrix.length;k++){
				matrix[k][column] = 0; 
			}

		}

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
