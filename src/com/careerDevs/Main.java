package com.careerDevs;

import com.HighLow.HighLow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("\u2680");
        Cup myCup = new Cup();
        Scanner scanner = new Scanner(System.in);
        //int input;
        String input;

        myCup.roll();
        System.out.println(myCup.displayCup());
        System.out.println("Which dice do you want to re-roll (1-5");
        input = scanner.nextLine();

        myCup.roll(myCup.parseSelections(input));
        System.out.println(myCup.displayCup());
    }
}
