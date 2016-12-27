package linkedListproblems;
import java.util.*;

class myNode{
	int data;
	myNode next;
	myNode random;
		
}
public class CloneList {

	public static myNode Insert(myNode head,int data) {
        myNode n = new myNode();
        n.data = data;
        n.next = null;
        n.random = null;
		
        if(head == null){
	       return n;
	   }
	    myNode x=head;
	    while(head.next!=null){        
	        head=head.next;
	    }
	    head.next = n;
	    return x;
	  
	}
	public static void setRandom(myNode root){
		
		myNode start = root;
		
		myNode m1 = root;		
		m1.random = start.next.next;
		//System.out.print(m1.random.data+" ");
		
		
		myNode m2 = root.next;
		start = root;		
		m2.random = start;
		//System.out.print(m2.random.data+" ");
		
		
		start = root;
		myNode m3 = root.next.next;
		m3.random = start.next.next.next.next;
		//System.out.print(m3.random.data+" ");
		
		start = root;
		myNode m4 = root.next.next.next;
		m4.random = start.next.next;
		//System.out.print(m4.random.data+" ");
		
		start = root;
		myNode m5 = root.next.next.next;
		m5.random = start.next;
		//System.out.print(m5.random.data+" ");
		
	}
	public static void printLinkedList(myNode root){
		myNode d = root;		
		while(d!=null){
			System.out.print(d.data+" ");
			d = d.next;
		}		
	}
	public static myNode cloneLinkedList(myNode root){
		
		myNode sroot=null;
		myNode start = root;
		int count = 0;
		while(start!=null){						
			count++;
			sroot = Insert(sroot,start.data);
			start=start.next;
		}
		
		start = root;
		myNode sstart = sroot;
		while(start!=null){
			myNode xx = start.random;
			int v = xx.data;
		}
		return sroot;
	}
	public static void main(String[] args) {
		
		myNode root = null;
		root = Insert(root,15);
		root = Insert(root,25);
		root = Insert(root,35);
		root = Insert(root,45);
		root = Insert(root,55);
				
		setRandom(root);
		printLinkedList(root);
		
		myNode dup=null;
		dup=cloneLinkedList(root);
		printLinkedList(dup);
	}

}
