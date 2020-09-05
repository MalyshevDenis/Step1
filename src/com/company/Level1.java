package com.company;


public class Level1 {

    static int odometer(int[] oksana) {

        int summaChetnih = 0;
        int summaNeChetnih = 0;
        for (int i = 0; i < oksana.length; i++) {
            if (oksana[i] % 2 == 0) {
                summaChetnih = summaChetnih + oksana[i];

            }

        }


        for (int i = 0; i < oksana.length; i++) {
            if (oksana[i] % 2 != 0) {
                summaNeChetnih = summaNeChetnih + oksana[i];
            }

        }

        int result = summaChetnih * summaNeChetnih;
        return (result);


    }



}
