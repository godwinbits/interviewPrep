package Q4_03_List_of_Depths;

import CtCILibrary.CtCILibrary.AssortedMethods;
import CtCILibrary.CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class QuestionBFS {

	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		LinkedList<TreeNode> inProcess = new LinkedList<TreeNode>();
		ArrayList<LinkedList<TreeNode>> output = new ArrayList<LinkedList<TreeNode>>();
		
		if(root == null)
			return output;
		else {
			inProcess.add(root);
			LinkedList<TreeNode> parent = new LinkedList<TreeNode>();
			output.add(inProcess);
			while(inProcess.size() > 0) {
				parent = inProcess;
				inProcess = new LinkedList<TreeNode>();
				for(TreeNode element:parent) {
					if(element.left != null)
						inProcess.add(element.left);
					if(element.right != null)
						inProcess.add(element.right);
				}
				if(inProcess.size() > 0)
					output.add(inProcess);
			}
			
			return output;
		}
		
		
		//TODO: Implement
		

	}
	
	public static void printResult(ArrayList<LinkedList<TreeNode>> result){
		int depth = 0;
		for(LinkedList<TreeNode> entry : result) {
			Iterator<TreeNode> i = entry.listIterator();
			System.out.print("Link list at depth " + depth + ":");
			while(i.hasNext()){
				System.out.print(" " + ((TreeNode)i.next()).data);
			}
			System.out.println();
			depth++;
		}
	}
	

	public static void main(String[] args) {
		int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = AssortedMethods.createTreeFromArray(nodes_flattened);
		root.print();
		ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root);
		printResult(list);
	}


}
