package com.tw.gameoflife;

import java.util.Scanner;

//takes input from the user
public class UserInput {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
