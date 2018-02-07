package Ch_04_Trees_and_Graphs.Q4_04_Check_Balanced;
import CtCILibrary.TreeNode;

public class QuestionImproved {
		

	public static void main(String[] args) {
		// Create balanced tree
		int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		root.print();


//		System.out.println("Is balanced? " + isBalanced(root));
//
//		root.insertInOrder(4); // Add 4 to make it unbalanced
//
		System.out.println("Is balanced? " + isBalanced(root));
	}


	public static boolean isBalanced(TreeNode node) {

        return false;

	}

}
