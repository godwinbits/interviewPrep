package Q4_04_Check_Balanced;
import CtCILibrary.CtCILibrary.TreeNode;

public class QuestionImproved {
		

	public static void main(String[] args) {
		// Create balanced tree
		int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		
		TreeNode root = TreeNode.createMinimalBST(array);
		//root.insertInOrder(4); // Add 4 to make it unbalanced
		root.print();


//		System.out.println("Is balanced? " + isBalanced(root));
//
		
//
		System.out.println("Is balanced? " + isBalanced(root));
	}
	
	public static int getHeight(TreeNode node) {
		if (node == null)
			return 0;
		int height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
		return height;
	}


	public static boolean isBalanced(TreeNode node) {
		if(node == null) {
			return true;
		}
		int balanceFactor = getHeight(node.left) - getHeight(node.right);
		if((balanceFactor > 1) || (balanceFactor < -1)) {
			return false;
		}
		return (isBalanced(node.left) && isBalanced(node.right));

	}

}
