package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int factorial = Num.squirrel(N);


        int result = Num.firstDigit(factorial);
        System.out.println(result);
    }

}
