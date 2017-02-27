package Base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestEven() {
		MyInteger int1 = new MyInteger(2);
		boolean dexpectedisEven = true;
		boolean dexpectedisEvenFalse = false;
		
		assertEquals(dexpectedisEven, int1.isEven());
		assertEquals(dexpectedisEven, MyInteger.isEven(4));
		assertEquals(dexpectedisEvenFalse, MyInteger.isEven(3));
		assertEquals(dexpectedisEven, MyInteger.isEven(int1));
		}
	@Test
	public void TestOdd() {
		MyInteger int2 = new MyInteger(1);
		boolean dexpectedisOdd = true;
		boolean dexpectedisOddFalse = false;
		
		assertEquals(dexpectedisOdd, int2.isOdd());
		assertEquals(dexpectedisOdd, MyInteger.isOdd(3));
		assertEquals(dexpectedisOddFalse, MyInteger.isOdd(4));
		assertEquals(dexpectedisOdd, MyInteger.isOdd(int2));
	}
	@Test
	public void TestPrime() {
		MyInteger int3 = new MyInteger(8);
		boolean dexpectedisPrime = false;
		boolean dexpectedisPrimeTrue = true;
		
		assertEquals(dexpectedisPrime, int3.isPrime());
		assertEquals(dexpectedisPrime, MyInteger.isPrime(10));
		assertEquals(dexpectedisPrimeTrue, MyInteger.isPrime(11));
		assertEquals(dexpectedisPrime, MyInteger.isPrime(int3));
	}
	@Test
	public void TestEquals() {
		MyInteger int4 = new MyInteger(10);
		boolean dexpectedEquals = false;
		boolean dexpectedEqualsOther = true;
		assertEquals(dexpectedEquals, int4.equals(2));
		assertEquals(dexpectedEqualsOther, int4.equals(int4));
	}

}
