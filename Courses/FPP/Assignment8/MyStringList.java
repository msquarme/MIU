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
* Question 2: Use MyStringList class and implement the Sort method to sort the arraylist using the CompareTo method of the String.
 * 
 * 
 * 
 * 		Solution:
 * 				I implement the remove method with method name: sort()
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyStringList{
	
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	
	// Sort method to sort the arraylist using the CompareTo method of the String
	
	public void sort() {
		
		for(int i = 0; i< this.size-1; i++) {
	         for (int j = i+1; j< this.size; j++) {
	            if(this.strArray[i].compareTo(this.strArray[j])>0) {
	               String temp = this.strArray[i];
	               this.strArray[i] = this.strArray[j];
	               this.strArray[j] = temp;
	            }
	         }
	      }
		
		
		
	}
	
	public void compareTo(MyStringList ls) {
		
		
		
	}
	// Add element in last
	public void add(String s){
		
		if(s==null) return;
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		
		return strArray[i];
	}
	
	public boolean find(String s){
		if(s==null) return false;
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false; // The element is not in the list
	}
	
	public void insert(String s, int pos){
		if(pos > size || pos<0 ) return;
		if(pos == strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
	}
	
/*	 public void insert(String s, int pos) {
	 if(pos<0 || pos > size) return;
		if(pos == strArray.length||size+1 > strArray.length) {
			resize ();
		}
		String[] temp = new String[strArray.length+1];
       for(int i = 0; i < pos; i++)
        temp[i] = strArray[i];
    temp[pos] = s;
    for(int i = pos + 1; i < strArray.length; i++)
        temp[i] =strArray[i - 1];
    strArray = temp;
		++size;
}*/
	
	public boolean remove(String s){
		if(size == 0) return false; // list is empty
		if(s==null) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
                // strArray = Arrays.copyOf(strArray, newlen);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	public boolean isEmpty(){
		return(size==0);
	}
    public Object clone()
    {
    	String[] temp = Arrays.copyOf(strArray, size);
    	return temp;
    	
    }

}