package edu.jsu.mcis.cs310;

public class Main {
    
    private final String defaultMessage = "Hello, World!";

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