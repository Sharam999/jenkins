package com.example;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println(getGreeting("World"));
    }

    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
