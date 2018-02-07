package Q4_02_Minimal_Tree;

import CtCILibrary.CtCILibrary.TreeNode;

public class Question {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//int[] array = {1,2,3};

		TreeNode myoutput = createMinimalBST(array);
		System.out.println("Root? " + myoutput.data);
		System.out.println("Created BST? " + myoutput.isBST());
		System.out.println("Height: " + myoutput.height());
		myoutput.print();
	}

	public static TreeNode createMinimalBST(int[] array) {
		// TODO: to be implemented
		int end = array.length - 1;
		int mid = (0+end)/2;
		TreeNode root = new TreeNode(array[mid]);
		
		createBST(root,array,0,mid-1);
		createBST(root,array,mid+1,end);
		
		return root;

	}
	
	public static TreeNode insert(TreeNode t, int value) {
		if(t==null) {
			t = new TreeNode(value);
			return t;
		}
		else if (value < t.data) {
			t.left = insert(t.left,value);
			t.left.parent = t;
		}
		else {
			t.right = insert(t.right,value);
			t.right.parent = t;
		}
		return t;
		
	}

	public static void createBST(TreeNode t, int[] array, int start, int end) {

		if (start <= end) {
			int mid = (start + end) / 2;
			//t.insertInOrder(array[mid]);
			t = insert(t,array[mid]);
			createBST(t, array, start, mid - 1);
			createBST(t, array, mid + 1, end);
		}
		else 
			return;
		 
	}

}
