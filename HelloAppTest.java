package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloAppTest {
    @Test
    public void testGetGreeting() {
        String expected = "Hello, World!";
        String actual = HelloApp.getGreeting("World");
        assertEquals(expected, actual);
    }
}
