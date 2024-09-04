package edu.jsu.mcis.cs310;

public class Main {
    
    private final String defaultMessage = "I'm a little teapot.";

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        
    }
    
    public String getGreeting() {
        return defaultMessage;
    }
    
    public String reverse(String message) {
        return message;
    }
    
}