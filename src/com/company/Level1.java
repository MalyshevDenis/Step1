package com.company;


public class Level1 {


    public static int factorial(int N) {
        int value = 1;
        for (int i = 1; i <= N; i++) {
            value = value * i;
        }
        return value;
    }

    public static int squirrel(int value) {
        int result = 1;
        for (int i = 1; i <= value; i = i * 10) {
            result = value / i;
        }
        return result;
    }


}
