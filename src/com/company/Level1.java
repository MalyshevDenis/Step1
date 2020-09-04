package com.company;


public class Level1 {


    public static int squirrel(int N) {

        int value = 1;
        for (int i = 1; i <= N; i++) {
            value = value * i;
        }

        int result = 1;
        for (int i = 1; i <= value; i = i * 10) {
            result = value / i;
        }
        return result;
    }


}
