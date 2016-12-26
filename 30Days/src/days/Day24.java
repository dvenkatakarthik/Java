package days;

import java.util.*;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next =null;
	}
}
public class Day24 {
	
	public static Node removeDuplicates(Node head){
		
	      HashSet<Integer> hs = new HashSet<Integer>();
			
			Node prev = null;
			Node temp = head;
			
			while(temp!=null){
				
				if(hs.contains(temp.data)){
					prev.next = temp.next;
				}
				else{
					hs.add(temp.data);
					prev = temp;
				}
				temp = temp.next;
				
			}			

			return head;
	}
	
	public static Node insert(Node head, int data){
		if(head == null)
			return new Node(data);
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new Node(data);
			return head;
		}
		
	}
	
	public static void display(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node head = null;
		while(n-- > 0){
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		
		head=removeDuplicates(head);
		display(head);
	}

}
