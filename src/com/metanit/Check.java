package com.metanit;

public class Check {

    public static int checking(String x, String y) {
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        String[] arabic = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        int flag = 0;
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(x) || roman[i].equals(y)) {
                flag = 1;
            }
        }

        for (int i = 0; i < roman.length; i++) {
            if (arabic[i].equals(x) || arabic[i].equals(y)) {
                flag = 2;
            }
        }
        if (flag != 1 && flag != 2) {
            flag = 3;
        }

        return flag;

    }

    public static void checkNum(String x, String y) {
        String[] arabic = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        int flagRim1 =0;
        int flagRim2 =0;

        for (int i = 0; i < arabic.length; i++) {
            if (arabic[i].equals(x))
                flagRim1 = 1;
        }
        for (int i = 0; i < arabic.length; i++) {
            if ( arabic[i].equals(y))
                flagRim2 = 1;
        }
        int flagRim = flagRim1+flagRim2;

        if (flagRim !=2) {
            System.out.println("Output:");
            throw new IllegalArgumentException();
        }
    }

    public static void checkRim(String x, String y) {
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        int flagRim1 =0;
        int flagRim2 =0;

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(x))
                flagRim1 = 1;
        }
        for (int i = 0; i < roman.length; i++) {
            if ( roman[i].equals(y))
                flagRim2 = 1;
        }
        int flagRim = flagRim1+flagRim2;

        if (flagRim !=2) {
            System.out.println("Output:");
            throw new IllegalArgumentException();
        }


    }
}