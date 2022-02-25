package com.basics;

import java.time.LocalDateTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println(flipNHeads(2));

//            clock();



    }
    public static String pluralize(String word, int num){
        if(num == 1){
            return word;
        }else {
            return word + "s";
        }

    }

    public static String flipNHeads(int n ){
        Random rn = new Random();
        double random;
        int x =0;
        int count = 0;


        while (x < n){
            random = rn.nextDouble();
            if(random >=0.5){
                System.out.println("heads");
                x++;
            }else {
                x = 0;
                System.out.println("tails");
            }
            count++;
        }

        return  "It took "+count+" flips to flip "+n+" heads in a row." ;
    }

    static void clock() {

        int lastSec = 0;
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            if (second != lastSec) {
                System.out.println(hour + ":" + minute + ":" + second);
                lastSec = second;
            }

        }
    }
}
