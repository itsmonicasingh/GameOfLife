package com.tw.gameoflife;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UserInputTest {

    @Test
    public void shouldReturnTheAliveCellInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("X".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        String testInput;
        UserInput consoleInput = new UserInput(scanner);
        testInput = consoleInput.getInput();

        assertEquals("X", testInput);
    }

    @Test
    public void shouldReturnTheDeadCellInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("-".getBytes());
        Scanner scanner = new Scanner(byteArrayInputStream);
        String testInput;
        UserInput consoleInput = new UserInput(scanner);
        testInput = consoleInput.getInput();

        assertEquals("-", testInput);
    }
}