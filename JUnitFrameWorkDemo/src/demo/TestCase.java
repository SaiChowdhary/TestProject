package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;


public class TestCase {
	
	@BeforeClass
	public  static void beforeclassmethod()
	{
		System.out.println("Before Class");
		
	}
	
	@Before
	public void beforetestcase()
	{
		System.out.println("Before testcase");
	}
	
	
	
	@Test
	public void test() {
		 assertEquals(4,FindResult.FindMaxNum(new int[] {1,2,3,4}));
		 assertEquals(-1,FindResult.FindMaxNum(new int[] {-1,-2,-3}));
		 assertEquals(0,FindResult.FindMaxNum(new int[] {1,2,3,4}));
		 //assertTrue(FindResult.isEvenNum(2));
		 //assertTrue(FindResult.isEvenNum(4));
		 //assertTrue(FindResult.isEvenNum(3));
		 
		 //assertFalse(FindResult.isEvenNum(3));
		 //assertFalse(FindResult.isEvenNum(4));
	}
	
	@After
	public  void aftertestcase()
	{
		System.out.println("After Test Case");
		
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After Test Class");
	}

}
