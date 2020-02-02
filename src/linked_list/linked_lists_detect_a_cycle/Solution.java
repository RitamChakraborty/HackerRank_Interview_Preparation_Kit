// https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

package linked_list.linked_lists_detect_a_cycle;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node next;
}

public class Solution {
	boolean hasCycle(Node head) {
		Set<Node> set = new HashSet<>();
		Node node = head;
		
		while (node != null) {
			if (set.contains(node)) {
				return true;
			} else {
				set.add(node);
			}
			
			node = node.next;
		}
		
		return false;
	}
}
