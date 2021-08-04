package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		String actual= "Y";
        String expected = "Y";                   

        assertEquals(expected, actual);                   
        System.out.println("Suite Test 2 is successful " + actual);
	}

}
