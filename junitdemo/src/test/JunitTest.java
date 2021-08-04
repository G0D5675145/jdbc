package test;

import static org.junit.Assert.*;

import org.junit.Test;

import business.JunitMessage;

public class JunitTest {
	
	public String message = "Raj";                       
    JunitMessage junitMessage = new JunitMessage(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Junit Message is printing ");            
		junitMessage.printMessage();
	}

	@Test
	public void testPrintHiMessage() {
		message = "Hi " + message;                       
        System.out.println("Junit Hi Message is printing ");           
        assertEquals(message, junitMessage.printHiMessage());
        System.out.println("Suite Test 1 is successful " + message);
	}

}
