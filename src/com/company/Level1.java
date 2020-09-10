package com.company;


public class Level1 {

    static int odometer(int[] oksana) {


        int x1 = oksana[0];
        int y1 = oksana[1];
        int x2 = oksana[2];
        int y2 = oksana[3];
        int x3 = oksana[4];
        int y3 = oksana[5];

        int result = x1 * y1 + x2 * (y2 - y1) + x3 * (y3 - y2);

        return result;
    }


}
