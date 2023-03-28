package Lesson3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExponentialTest {

	Exponential ex;
	@Test
	public void test() {
		
		ex = new Exponential();
		
		assertEquals(8.0, ex.power(2, 3));
		
	}

}
