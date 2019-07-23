package com.intefacechallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int score;
    private String weapon;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.weapon = "Knife";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.score);
        values.add(2, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.score = Integer.parseInt(savedValues.get(1));
            this.weapon = savedValues.get(2);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
