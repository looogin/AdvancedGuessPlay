package com.company;

import com.company.Players.DummyPlayer;
import com.company.Players.NormalPlayer;
import com.company.Players.Player;
import com.company.Players.SmartPlayer;
import java.util.ArrayList;
import java.util.List;

public class GuessGame {
    private int i = 0;
    private int numbersofplayer = 1;
    private int maxNumber = 20;
    private List<Player> players = new ArrayList<>();
    private String winPlayer;

    public GuessGame() {
        createPlayer(20);
        createPlayer(50);
        createPlayer(120);
        createPlayer(100);
        createPlayer(40);

    }

    public void startGame() {

        while (i < 100) {
            boolean win = false;
            System.out.println("Я загадываю число от 0 до " + maxNumber + " ...");
            int number = intargetNumber();
            while (true) {
                System.out.println("Число, хоторое нужно угадать: " + number);
                for (Player p : players) {
                    p.guess();
                    System.out.println(p.getName() + " думает, что это " + p.getNumber());
                    if (p.getNumber() == number) {
                        System.out.println(p.getName() + " угадал ");
                        p.addScorePoint();
                        System.out.println(" ***Конец игры*** ");
                        win = true;
                        break;
                    }
                }
                if (win) {
                    ++i;
                    break;
                } else System.out.println("Игроки должны попробовать еще раз");
            }

        }
        System.out.print("Очки игроков:");
        int last=0;
        for (Player p : players) {
            if(last<p.getScore()){
                winPlayer=p.getName();
                last=p.getScore();
            }
            System.out.print(" "+p.getName()+" "+p.getScore());
        }
        System.out.println();
        System.out.println("ПОБЕДИЛ "+winPlayer +"!!!!!!!!!!");

    }

    private int intargetNumber() {
        return (int) (Math.random() * maxNumber);
    }

    private void createPlayer(int IQ) {
        if (IQ > 0 & IQ <= 20) players.add(new DummyPlayer(maxNumber, "Игрок_" + numbersofplayer));
        if (IQ > 21 & IQ <= 80) players.add(new NormalPlayer(maxNumber, "Игрок_" + numbersofplayer));
        if (IQ > 81 & IQ <= 200) players.add(new SmartPlayer(maxNumber, "Игрок_" + numbersofplayer));
        ++numbersofplayer;
    }

}



