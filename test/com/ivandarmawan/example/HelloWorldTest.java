/*
 * dzone.com/articles/introduction-to-the-unit-testing-technique-using-j
 */
package com.ivandarmawan.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivand
 */
public class HelloWorldTest {
    
    HelloWorld helloWorldInstance;
    
    public HelloWorldTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* HelloWorldTest: Before method setUP()");
        helloWorldInstance = new HelloWorld();
    }
    
    @After
    public void tearDown() {
        System.out.println("* Geeraay wkwkwk ");
    }

    /**
     * Test of formMessage method, of class HelloWorld.
     */
    @Test
    public void testFormMessage() {
        String expResult = "Hello World";
        String result = helloWorldInstance.formMessage();
        
        System.out.println("* HelloWorldTest: Test method 1 testFormMessage");
        
        assertEquals(expResult, result);
        
        //fail("The test case is a prototype.");
    }
    
}
