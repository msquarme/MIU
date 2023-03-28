package Lesson3;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
* 
* Question 3: Perform Recursive Binary Search for the int[] array of inputs.
Binary Search Algorithm – Your input should be in sorted order either supply a sorted
input or use Arrays.sort to arrange the elements is the natural order.
	if the array is empty
		return –1 as the search result
	else if the middle element matches the target
		return the subscript of the middle element as the result
	else if the target is less than the middle element
		recursively search the array elements before the middle element
		and return the result
	else
		recursively search the array elements after the middle element and return the result
 * 
 * */



import java.util.Arrays;

public class BinarySearch {
	
	public  int recursiveBinarySearch(int[] arr, int target, int l, int r) {
		
		int middle = l + (r-l)/2;
		if(l > r) {
			return -1;
		}
		if(target == arr[middle]) {
			return arr[middle];
		}
		else if(target < arr[middle]) {
			// Search on the left
			return recursiveBinarySearch(arr, target, l, middle-1);
		}
		else {
			// Search on the right
			
			return recursiveBinarySearch(arr, target, middle+1, r);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr =  {8,12,99,1,2,3,4,5,6,7};
		Arrays.sort(arr);
		BinarySearch BS = new BinarySearch();
		System.out.println(BS.recursiveBinarySearch(arr, 7, 3, arr.length-1));
		
	}

}
