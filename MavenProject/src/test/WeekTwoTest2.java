package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.WeekTwoModel;

public class WeekTwoTest2 {
	
	String message = "Test";
	WeekTwoModel model = new WeekTwoModel(message);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Inside testMethodTwo()");
		message = "Hi!" + "Test";
		assertEquals(message,model.MethodTwo());
		
	}
	
}
