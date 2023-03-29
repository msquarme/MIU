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
* 	A Test class to test the three problems.
 * */

public class Test {

	public static void main(String[] args) {
		
		
		
		MyStringList l = new MyStringList();
		SinglyLinkedList sList = new SinglyLinkedList();
		MyStringDLinkedList list = new MyStringDLinkedList();
		
		
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 2);
		System.out.println(l);
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
		
		// Testing problem 1
		
		l.sort();
		
		System.out.println("After sorting strArray: ");
		System.out.println(l);

		    
        
	    //Add nodes to the list    
	    sList.addNode(1);    
	    sList.addNode(2);    
	    sList.addNode(3);    
	    sList.addNode(4); 
	    sList.addNode(7);
	    sList.addkth(5, 4);
	    sList.addkth(6, 5);
	    //Displays the nodes present in the list    
	    sList.display(); 
	    
	    
	    // testing problem 2
	    sList.removeLast();
	    
	    System.out.println("The singly linked list after removing last element:");
	    sList.display();
	    
	    
		System.out.println("Is Empty : "+list.isEmpty());
		list.addFirst("Java");
		list.addFirst("Android");
		list.addFirst("C#");
		list.insert("Android", 0);
		list.displayNodes();
		
		System.out.println(list.find("Java"));
		
		System.out.println("Removing an element Java from the list");
		
		// testing problem 3
		list.removeNode("Java");
		list.displayNodes();
		

	}

}
