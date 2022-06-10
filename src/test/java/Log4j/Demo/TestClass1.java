package Log4j.Demo;

import org.testng.annotations.Test;

import Library.Log;

public class TestClass1 
{
	@Test
	 public void testCase1() 
	{
	  Log.startTestCase("testCase1");
	  Log.info("This is testCase1");
	  Log.endTestCase("testCase1");
	 }
	 @Test
	 public void testCase2() 
	 {
	  Log.startTestCase("testCase2");
	  Log.info("This is testCase2");
	  Log.endTestCase("testCase2");
	 }
	 @Test
	 public void testCase3() 
	 {
	  Log.startTestCase("testCase3");
	  Log.info("This is testCase3");
	  Log.endTestCase("testCase3");
	 }
}
