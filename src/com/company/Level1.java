package com.company;




public class Level1 {


    public static int squirrel(int N) {
        int factorial = N;
        for (int i = 1; i < N; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int firstDigit(int factorial) {
        int result = 1;
        for (int i = 10; i < factorial; i = i * 10) {
            result = factorial / i;
        }
        return result;
    }


}
