package Lesson3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bnarySearchTest {

	BinarySearch BS;
	@Test
	void test() {
		BS = new BinarySearch();
		int[] array =  {8,12,99,1,2,3,4,5,6,7};
		assertEquals(17,BS.recursiveBinarySearch(array, 7, 0, 9));
		
	}
}
