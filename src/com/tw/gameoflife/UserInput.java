package com.tw.gameoflife;

import java.util.Scanner;

//Reads The Console Input From The User And Returns It As A String.
public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }
}