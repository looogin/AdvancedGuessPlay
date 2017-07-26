package com.company.Players;

public abstract class Player {


    private String name;


    public Player(int maxRange, String name) {
       this.name =name;
    }

    public abstract void guess();

    public abstract int getNumber();

    public String getName(){
        return name;
    }

    public abstract int getScore();

    abstract public void addScorePoint();
}
