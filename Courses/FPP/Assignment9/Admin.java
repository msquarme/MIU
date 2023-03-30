package prob1;
import java.util.*;

/*
 * @author Musie M.
 * ID: 616079
 * 
 * 						========================================
 * 									Assignment Twelve
 * 						========================================
 * 
 * 
 * 
 * */

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		
		HashMap<Key, Student>  hmap = new HashMap<Key, Student>();
		Key k;
		for(Student s : students) {
			k = createKey(s);
			hmap.put(k,s);
			
		}
		return hmap;
	}
	
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		
		Iterator<Key>  iterator = maps.keySet().iterator();
		double totalGPA = 0.0d;
		double averageGPA = 0.0d;
		int counter = 0;
		while(iterator.hasNext()) {
			
			Student s = maps.get(iterator.next());
			totalGPA += s.getGpa();
			counter++;
		}
		
		averageGPA = totalGPA / counter;
		return averageGPA;	 		  
}
	
	public static Key createKey(Object obj) {
		Student s = (Student) obj;
		return new Key(s.getFirstName(), s.getLastName());
		
	}
	
	
}
