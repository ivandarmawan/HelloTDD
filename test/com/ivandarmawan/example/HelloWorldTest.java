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
        helloWorldInstance = new HelloWorld();
    }
    
    /**
     * Test of formMessage method, of class HelloWorld.
     */
    @Test
    public void testFormMessage() {
        String expResult = "Hello World";
        String result = helloWorldInstance.formMessage();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMethodGreet(){
        String expResult = "Hello Bob";
        String result = helloWorldInstance.greet("Bob");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testClassGreet(){
        String expResult = "Hello Bob";
        Greet greet = new Greet();
        String result = greet.getName("Bob");
        assertEquals(expResult, result);
    }
    
    
}
