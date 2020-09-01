package com.company;


import java.util.Scanner;

public class Squirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int factorial = Squirrel.squirrel(N);

        int result = Squirrel.firstDigit(factorial);
        System.out.println(result);
    }


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
