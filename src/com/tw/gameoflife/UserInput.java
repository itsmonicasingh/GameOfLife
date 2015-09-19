package com.tw.gameoflife;

import java.util.Scanner;

public class UserInput {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
