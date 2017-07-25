package com.company.Players;

public class NormalPlayer implements Player {
    private int number;
    private int maxrange;

    public NormalPlayer(int maxrange) {
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
}
