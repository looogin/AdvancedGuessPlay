package com.company.Players;

public class NormalPlayer implements Player {
    private final String name;
    private int number;
    private int maxrange;

    public NormalPlayer(int maxrange, String name) {
        this.name = name;
        this.maxrange = maxrange;
    }

    @Override
    public void guess() {
        number = (int) ((Math.random() * maxrange)+Math.random());
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getName() {
        return name;
    }


}
