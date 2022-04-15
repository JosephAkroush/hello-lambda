package com.example.lambda;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HelloTest {
    @Test
    public void handleRequest() throws IOException {
        // Arrange
        Hello hello = new Hello();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String expected = "this is the message";

        // Act
        hello.handleRequest(stream);

        // Assert
        assertEquals(expected, stream.toString());
    }
}