package com.careerDevs;

public class Player {
    public String name;
    public Cup cup = new Cup();
    public int score = 0;
    public int roundTotal;


    public Player(String name) {
        this.name = name;
    }

    public int updateScore() {
         roundTotal = 0;
        for (Die die : cup.dice) {
            roundTotal += die.faceUpValue;
        }
        score += roundTotal;
        return roundTotal;
    }






}
