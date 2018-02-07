package Q4_10_Check_Subtree;

import CtCILibrary.CtCILibrary.AssortedMethods;
import CtCILibrary.CtCILibrary.TreeNode;
import java.util.*;

public class QuestionA {

	public static void convertToString(TreeNode t, StringBuilder treeString) {
		if(t == null) {
			treeString.append("X");
			return;
		}
		else {
			treeString.append(t.data);
			convertToString(t.left,treeString);
			convertToString(t.right,treeString);
		}
		
	}

	public static boolean containsTree(TreeNode t1, TreeNode t2) {
		StringBuilder t1String = new StringBuilder();
		StringBuilder t2String = new StringBuilder();
		
		convertToString(t1,t1String);
		convertToString(t2,t2String);
		
		if(t1String.indexOf(t2String.toString()) == -1) {
			return false;
		}
		else 
			return true;		
	}

	public static void main(String[] args) {
		// t2 is a subtree of t1
		int[] array1 = { 1, 2, 1, 3, 1, 1, 5 };
		int[] array2 = { 2, 3, 1 };

		TreeNode t1 = AssortedMethods.createTreeFromArray(array1);
		TreeNode t2 = AssortedMethods.createTreeFromArray(array2);

		if (containsTree(t1, t2)) {
			System.out.println("t2 is a subtree of t1");
		} else {
			System.out.println("t2 is not a subtree of t1");
		}

		// t4 is not a subtree of t3
		int[] array3 = { 1, 2, 3 };
		TreeNode t3 = AssortedMethods.createTreeFromArray(array1);
		TreeNode t4 = AssortedMethods.createTreeFromArray(array3);

		if (containsTree(t3, t4)) {
			System.out.println("t4 is a subtree of t3");
		} else {
			System.out.println("t4 is not a subtree of t3");
		}

	}

}
