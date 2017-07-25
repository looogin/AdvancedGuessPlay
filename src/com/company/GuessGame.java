package com.company;

import com.company.Players.*;

public class GuessGame {
    private SmartPlayer p1;
    private NormalPlayer p2;
    private DummyPlayer p3;
    private int guessp1;
    private int guessp2;
    private int guessp3 ;
    private int i =0;
    private int maxNumber=10;
    private int winp1;
    private int winp2;
    private int winp3;

    public GuessGame(){
        createPlayer(18);
        createPlayer(50);
        createPlayer(120);
    }

    public void startGame() {
        while (i<10) {
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
        System.out.println(winp1 +" " + winp2 +" " + winp3);
    }

    private int intargetNumber() {
        return (int) (Math.random() * maxNumber);
    }

    private void createPlayer(int IQ) {
        if (IQ<0||IQ<20) p3 = new DummyPlayer(maxNumber);
        if (IQ<21||IQ<80) p2 = new NormalPlayer(maxNumber);
        if (IQ<81||IQ<200) p1 = new SmartPlayer(maxNumber);
    }

}



