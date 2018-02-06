package Ch_04_Trees_and_Graphs.Q4_02_Minimal_Tree;

		import CtCILibrary.TreeNode;

		import java.util.Optional;

public class Question {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		TreeNode myoutput = createMinimalBST(array);
		System.out.println("Root? " + myoutput.data);
		System.out.println("Created BST? " + myoutput.isBST());
		System.out.println("Height: " + myoutput.height());
		myoutput.print();
	}

	public static TreeNode createMinimalBST(int[] array) {
		//TODO: to be impleented
		 return null;

	}


}
