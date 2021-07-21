package com.careerDevs;

import java.util.Scanner;

public class Yahtzee {
    //public Cup myCup = new Cup();
    public Player player;
    private final Scanner scanner = new Scanner(System.in);

    public Yahtzee() {
        System.out.println("Enter Player One Name: ");
        //String name = scanner.nextLine();
        //player = new Player(name);
        player = new Player((scanner.nextLine()).trim());
    }
    //TODO refactor play to run 5 turns then display total score.
    public void play() {
        turn();
        //System.out.println("\u2680");
    }

    public void getSelections() {

        System.out.println("Which dice do you want to re-roll (1-5");
        String input = scanner.nextLine();
        player.cup.roll(player.cup.parseSelections(input));
    }
    //TODO refactor turn to update score and display round score *(and total score)
    public void turn() {
        player.cup.roll();
        for (int i = 0; i < 2; i++) {
            System.out.println(player.cup.displayCup());
            getSelections();
        }

        System.out.println(player.cup.displayCup());

    }

}
