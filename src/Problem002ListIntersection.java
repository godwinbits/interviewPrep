/**
 * Created by gselvam on 2/3/18.
 * Given two (singly) linked lists, determine if the two lists interesect. Return the intersecting node. Note that the intersection is
 * defined based on reference, not value. That is , if the kth node of the first linked list is the exact same node (by reference) as the
 * jth node of the second linked list, then they are intersecting
 */

import java.util.*;
public class Problem002ListIntersection {
	public static boolean checkIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2 ) {
		if(list2.size() > list1.size()) {
			return checkIntersection(list2,list1);
		}
		if(list2.size() == 0) {
			return true;
		}
		int difference = list1.size() - list2.size();
		Iterator it1 = list1.listIterator(difference);
		Iterator it2 = list2.iterator();
		while(it1.hasNext()) {
			if(it1 == it2) {
				return true;
			}
			if(it1.next() == it2.next()){
				return true;
			}
			
		}
		return false;
	}	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		for (int i=0;i<10;i++) {
			list1.add(i);
		}
		for(int i=20;i<25;i++) {
			list2.add(i);
		}
		list2.add(9);
		
		System.out.println(checkIntersection(list1,list2));	
	}
}
