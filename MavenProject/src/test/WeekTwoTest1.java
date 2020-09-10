package test;

import static org.junit.Assert.*;

import model.WeekTwoModel;
import org.junit.Before;
import org.junit.Test;

public class WeekTwoTest1 {
	
	String message = "Test";
	WeekTwoModel model = new WeekTwoModel(message);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, model.printMethod());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testMessageLength() {
		System.out.println("Inside testOfMessageLength()");
		int messageLength = message.length();
		assertTrue(messageLength == model.returnMessageLength());
	}
	
	@Test
	public void testMessageNotNull() {
		System.out.println("Inside testOfMessageNotNull()");
		assertNotNull(model.printMethod());
	}
	
}
