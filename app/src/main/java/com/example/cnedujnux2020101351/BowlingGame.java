package com.example.cnedujnux2020101351;

public class BowlingGame {
    private int score=0;
    public int score() {
        return score;
    }

    public void roll(int pin) {
        score+=pin;
    }
}
