package DS;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int size;
	public MyBST() {
		root = null;
	}
	
	/**
	 * 
	 * @author: Musie M.
	 * ID: 616079
	 * 
	 * 								=====================================
	 * 											Assignment Eleven
	 * 								=====================================
	 * 
	 * 			
	 * 
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	private void preOrder(BinaryNode t){
		System.out.println("\nPreOrder");
		if( t != null ){
			System.out.print(t.element+",");
			printTree( t.left );
		    printTree( t.right );
		   
		}
	
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(BinaryNode t){ 
		System.out.println("\nPostOrder");
		if( t != null ){
			printTree( t.left );
		    printTree( t.right );
		    System.out.print(t.element+",");
		   
		}
	
	}
	
	private BinaryNode find(BinaryNode r, int item) {
		if(r == null) return null;
		while(r != null) {
			if(r.element == item) return r;
			else if(r.element > item) find(r.left,item);
			else find(r.right,item);
		}
		return null;
	}
	public boolean contains(Integer key){ 
		
		BinaryNode current = root;
		if (current== null) return false;
		while(current != null) {
			
			if(current.element == key) return true;
			
			else if(current.element > key) current = current.left; // check left
			else current = current.right;
		}
		
		return false;
		//return (find(root,key) == null) ? false : true;
	}
	
	public Integer getRoot(){
		
		return root.element;
	}
	
	public int size(){
		
		return this.size;
	}
	
	
	
	public boolean isEmpty(){
		
		return root==null ? true:false;
	}
	
	
	private Integer findMin(BinaryNode root){
		
		if (root == null) return Integer.MIN_VALUE;
		else {
			if (root.left == null) return root.element;
			else return findMin(root.left);
		}
		
	}
	private Integer findMax(BinaryNode root){
		
		if (root == null) return null;
		else {
			if (root.right == null) return root.element;
			else return findMax(root.right);
		}
	}
	public Integer findMin(){
		return findMin(root);
		}
	
	public Integer findMax(){
		return findMax(root);
		}
	
	
	public Integer leafNodes(){
		return leafNodes(root);
		}
	private int leafNodes(BinaryNode t){
		if (t == null)
            return 0;
        if (t.left == null && t.right == null)
            return 1;
        else
            return leafNodes(t.left) + leafNodes(t.right);
		
		
	}
	
	
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			System.out.print(t.element+",");
			printTree( t.left );
		    printTree( t.right );
		   
		} 
	}
		 
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
			size++;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		mybst.insert(12);
		
		//System.out.println(mybst.leafNodes());
		mybst.printTree();
		
		mybst.preOrder();
		mybst.postOrder();
		System.out.println("\n\nChecking if 2 in the BST: " + mybst.contains(2));
		
		
		System.out.println("Root of the BST: " + mybst.getRoot());
		System.out.println("Leaf Nodes in the BST: " + mybst.leafNodes());
		
		System.out.println(" Size of the BST: " + mybst.size());
		
		System.out.println("Minimum element in the BST: " + mybst.findMin());
		System.out.println("Maximum element in the BST: " + mybst.findMax());
		
		System.out.println("Check if the BST is empty: " + mybst.isEmpty());
		
		
		
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j = 0; j < a.length; j++ ) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();		
			Integer nextItem = null;
			while(it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			} 
			System.out.println();
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11)+", "+ map.get(10);
		System.out.println(str);
			
	}
}
