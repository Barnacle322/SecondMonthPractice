package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final double Pi = 3.14;
        Circle[] circleArray = new Circle[10];
        Random rn = new Random();

        for (int i = 0; i< circleArray.length; i++) {
            circleArray[i] = new Circle(rn.nextInt(10) + 1);
        }

        for (Circle i: circleArray) {
            System.out.printf("%s%n", Math.round(Math.pow(i.getRadius(), 2) * Pi));
        }

        System.out.println(Circle.getCounter());

    }
}
