package problems;
/*
 * 
 * Hacker Rank solution for BST or not for a given BTree
 * 
 * */
//boolean checkBST(Node root) {     
//    return isBST(root, -1, 10001);
//}   
//boolean isBST(Node node,int min,int max){        
//    if (node==null) return true;
//    if (node.data <= min || node.data >= max) return false;    
//    return isBST(node.left, min, node.data) && isBST(node.right, node.data, max);  
//}

/*
 * Binary Search Tree sample program
 * 
 * */

class Node{
	int data;
	Node left,right;
	public Node(int datavalue){
		data = datavalue;
		left=right=null;
	}
}
public class BSTCheck {		
	Node root;
	Node prev;
    
    boolean checkBST()  {
        prev = null;
        return checkBST(root);
    }	
	
	boolean checkBST(Node root) {
        
        if (root != null)
        {
            if (!checkBST(root.left))
                return false;
 
            if (prev != null && root.data < prev.data )
                return false;
            prev = root;
            return checkBST(root.right);
        }
        return true;       
    }  
    
	public static void main(String[] args) {
		BSTCheck tree = new BSTCheck();
        
		tree.root = new Node(5);
		tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);		
		
        if (tree.checkBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");        
	}	
	
}


