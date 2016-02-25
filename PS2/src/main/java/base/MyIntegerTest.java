package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void test() {
		MyInteger test = new MyInteger(20);
		boolean output = test.isEven();
		assertEquals(true, output);
		
		output = test.isOdd();
		assertEquals(false, output);
		
		output = test.isPrime();
		assertEquals(false, output);
		
		output = MyInteger.isEven(6);
		assertEquals(true, output);
		
		output = MyInteger.isOdd(5);
		assertEquals(true, output);
		
		output = MyInteger.isPrime(5);
		assertEquals(true, output);
		
		output = MyInteger.isEven(8);
		assertEquals(true, output);
		
		output = MyInteger.isOdd(7);
		assertEquals(true, output);
		
		output = MyInteger.isPrime(8);
		assertEquals(false, output);
		
		output = test.equals(20);
		assertEquals(true, output);
		
		output = test.equals(20);
		assertEquals(true, output);
	}

}
