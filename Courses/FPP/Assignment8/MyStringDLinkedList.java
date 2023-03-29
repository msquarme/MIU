package DS;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Ten
* 			##################################
* 
* Question 3: Use the DuoblyLinkedList class and implement Remove method. This method should remove the node that contains a String value that is passed as a parameter.
 * 
 * 
 * 
 * 		Solution:
 * 				I implement the remove method with method name: removeNode(String data)
 * */



public class MyStringDLinkedList {
	Node header;
	MyStringDLinkedList(){
		header = new Node(null,null, null);
	}
	public void addFirst(String item){
		Node n = new Node(header,item,header.next);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
	}
	/** returns the index of the String s, if found; 
	 * -1 otherwise 
	 */
	public int find(String s){
		if(s == null) return -1;
		Node currentNode = header;
		int i = -1;
		while(currentNode.next != null){
			++i;
			currentNode = currentNode.next;
			if(s.equals(currentNode.value)) return i;
		}
		return -1;
	}
	public int size(){
		int count = 0;
		Node next = header.next;
		while(next != null){
			++count;
			next = next.next;
		}
		return count;
	}
	private Node getNode(int pos){
		if (pos >= size() && (pos<0)) throw new IndexOutOfBoundsException();		
		Node next = header;
		for(int i = 0; i <= pos; ++i){
			next = next.next;			
		}
		//next is the node we are seeking
		return next;
	}
	public String get(int pos){
		Node node = getNode(pos);
		return (node != null) ? node.value : null;
	}
	public void insert(String s, int pos) {
		//corrected to throw exception
		if(pos > size() && (pos<0)) {
			throw new IndexOutOfBoundsException("pos = "+pos +" but size = "+size());
		}
		Node current = header;
		Node previous = null;
		for(int i = 0; i <= pos; ++i){
			if(i==pos){
				previous = current;
			}
			current = current.next;
		}
		Node insertNode = new Node(previous,s,current);
		if(current != null){
			current.previous = insertNode;
		}
		previous.next =insertNode;
	}
	public boolean isEmpty() {
		if(header.next == null || size()==0)
			return true;
		else
			return false;
	}
	/** remove object at specified index */
	public boolean remove(int index){
		Node toBeRemoved = getNode(index);
		if(toBeRemoved == null) return false;
		Node previous = toBeRemoved.previous;
		Node next = toBeRemoved.next;
		previous.next = next;
		if(next != null){
			next.previous = previous;
		}
		toBeRemoved = null;
		return true;
	}
	
	
	/** remove by specifying object -- removes
	 *  first occurrence of s
	 *  
	 *  
	 *  Solution To homework is written below.
	 *  
	 */
	
	// passing the parameter as String
	public void removeNode(String data) {
	    Node current = header;
	    while (current != null && current.value != data) {
	        current = current.next;
	    }
	    deleteNode(current);
	}
	
	private void deleteNode(Node node) {
	    if (node != null) {
	        if (node.previous != null)
	            node.previous.next = node.next;
	        else
	            header = node.next;
	        if (node.next != null)
	            node.next.previous = node.previous;
            node = node.previous;
	    }
	}
	
	
	
	
	public boolean remove(String s){
		int pos = find(s);
		if(pos == -1) return false;
		return remove(pos);
		
	}	
	void displayNodes() {
		Node next = header.next;
		while(next.next != null){
			System.out.print(next.value + "-->");
			next = next.next;
		}
		System.out.println(next.value);
	}
	
	class Node {
		Node previous;
		String value;
		Node next;
		
		Node(Node previous, String value, Node next){
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
		
	}
	
	}
