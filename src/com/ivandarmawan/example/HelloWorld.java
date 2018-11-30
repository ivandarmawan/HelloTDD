/*
 * dzone.com/articles/introduction-to-the-unit-testing-technique-using-j
 */
package com.ivandarmawan.example;

/**
 * An Object Oriented Hello World Program.  
 * @version 1.0 
 */
public class HelloWorld {
    private String hello;
    private String world;

    /**
     * Constructor
     */
    HelloWorld() {
        hello = "Hello";
        world = "World";
    }

    /**
     * forms the Hello World Message.          
     */        
    public String formMessage(){
        String message;
        message = hello + " " + world;
        return message;
    }
    
    public String greet(String name){
        String message = "Hello" + " " + name;
        return message;
    }
    
    
}
