package com.company;

import com.company.Players.*;
import java.util.ArrayList;
import java.util.List;

public class GuessGame {
    private int i =0;
    private int numbersofplayer = 1;
    private int maxNumber=10;
    private int winp1;
    private int winp2;
    private int winp3;
    List<Player> players = new ArrayList<>();

    public GuessGame(){
        createPlayer(20);

    }

    public void startGame() {
        System.out.println(players.get(0).getName());
        /*while (i<10) {
            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;
            System.out.println("Я загадываю число от 0 до "+ maxNumber+" ...");
            int number= intargetNumber();
            while (true) {
                System.out.println("Число, хоторое нужно угадать: " + number);
                p1.guess();
                p2.guess();
                p3.guess();
                guessp1 = p1.getNumber();
                System.out.println("Первый игрок думает, что это " + guessp1);
                guessp2 = p2.getNumber();
                System.out.println("Второй игрок думает, что это " + guessp2);
                guessp3 = p3.getNumber();
                System.out.println("Третий игрок думает, что это " + guessp3);

                if (guessp1 == number) {
                    p1isRight = true;
                }
                if (guessp2 == number) {
                    p2isRight = true;
                }
                if (guessp3 == number) {
                    p3isRight = true;
                }
                if (p1isRight || p2isRight || p3isRight) {

                    System.out.println("У нас есть победитель!");
                    if (p1isRight) {
                        System.out.println("Первый игрок угадал ");
                        ++winp1;
                    }
                    if (p2isRight) {
                        System.out.println("Второй игрок угадал ");
                        ++winp2;
                    }
                    if (p3isRight) {
                        System.out.println("Третий игрок угадаk ");
                        ++winp3;
                    }
                    System.out.println(" ***Конец игры*** ");
                    assert (i<3): "Значение i больше 3";
                    i++;
                    break;
                } else System.out.println("Игроки должны попробовать еще раз");
            }

        }
        System.out.println(winp1 +" " + winp2 +" " + winp3);*/
    }

    private int intargetNumber() {
        return (int) (Math.random() * maxNumber);
    }

    private void createPlayer(int IQ) {
        if (IQ>0&IQ<=20)   players.add(new DummyPlayer(maxNumber,"Игрок_" + numbersofplayer));
        if (IQ>21&IQ<=80)  players.add( new NormalPlayer(maxNumber,"Игрок_" + numbersofplayer));
        if (IQ>81&IQ<=200) players.add( new SmartPlayer(maxNumber,"Игрок_" + numbersofplayer ));
        ++numbersofplayer;
    }

}



