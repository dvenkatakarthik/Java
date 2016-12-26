package days;

import java.util.*;

/*
class Node{
	Node left,right;
	int data;
	Node(int n){
		this.data = n;
		left=right=null;
	}
}

public class Day23 {

	public static void levelOrder(Node root){
		
        Queue<Node> q = new LinkedList<Node>();
		q.add(root);
        
		while(!q.isEmpty()){
			
			Node t = q.remove();
			System.out.print(t.data+" ");
			
			if(t.left != null)
				q.add(t.left);
			
			if(t.right != null)
				q.add(t.right);
		}
				
	} 	
	
	public static Node insert(Node root, int data){
		if(root==null){
			return 	new Node(data);
		}
		else{
			Node cur;
			if(data < root.data){
				cur = insert(root.left,data);
				root.left = cur;
			}
			else{
				cur = insert(root.right,data);
				root.right = cur;
			}
			return root;
		}			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while(n-- > 0){
			int data = sc.nextInt();
			root = insert(root,data);
		}
		
		levelOrder(root);
		
	}

}
*/
