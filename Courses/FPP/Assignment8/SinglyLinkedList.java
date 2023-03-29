package DS;

import java.util.ArrayList;
/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Ten
* 			##################################
* 
* Question 2: Use the SinglyLinkedList class and implement RemoveLast method. This method should remove the last occurrence of an integer value that is passed as a parameter.
 * 
 * 
 * 
 * 		Solution:
 * 				I implement the remove method with method name: removeLast()
 * */

import java.util.List;

//Represent a node of the singly linked list    
public class SinglyLinkedList {   
class Node{    
    int data; 
    Node next;    
        
    public Node(int data) {    
        this.data = data;    
        this.next = null;    
    }    
}    
 
//Represent the head and tail of the singly linked list    
public Node head = null;    
public Node tail = null;    
    
//addNode() will add a new node to the list    
public void addNode(int data) {    
    //Create a new node    
    Node newNode = new Node(data);    
        
    //Checks if the list is empty    
    if(head == null) {    
        //If list is empty, both head and tail will point to new node    
        head = newNode;    
        tail = newNode;    
    }    
    else {    
        //newNode will be added after tail such that tail's next will point to newNode    
        tail.next = newNode;    
        //newNode will become new tail of the list    
        tail = newNode;    
    }    
}  


public void addkth(int data, int pos) {    
    //Create a new node    
    Node newNode = new Node(data); 
    Node current = head;
        
    for(int i = 1; i < pos; i ++) {
    	current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
}    
    
public boolean find(int n) {
	Node current  = head;
	if(head==null)
	{return false;}
	
	while(current!=null) {
		if (current.data==n) {
			return true;
		}
		current = current.next;    
	}
	return false;
}
//display() will display all the nodes present in the list    
public void display() {    
    //Node current will point to head    
    Node current = head;    
        
    if(head == null) {    
        System.out.println("List is empty");    
        return;    
    }    
    System.out.println("Nodes of singly linked list: ");    
    while(current != null) {    
        //Prints each node by incrementing pointer    
        System.out.print(current.data + " ");    
        current = current.next;    
    }    
    System.out.println();    
}    
public void removeLast() {
	
	Node current = head;
	if(current == null) return;
	while(current.next.next!=null) {
		current = current.next;
	}
	current.next = null;
}


public void removeNode(int n) {
	
	// check if head is null
	Node current = head;
	Node prev = null;
	if (current == null) return;
	 // remove a single node
	if(head == tail && head.data == n) {
		head = null;
		tail = null;
		return;
	}
	// removing head
	while(current != null && current.data == n) {
		head = current.next;
		return;
	}
	// remove node in between
	while(current !=null && current.data != n) {
		prev = current;
		current = current.next;
	}
	if(current == null) {
		return;
	}
	prev.next = current.next;
	
}
    
}
