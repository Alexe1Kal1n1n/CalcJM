package com.metanit;


import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;


public class Main {

    public static String numb1;
    public static String numb2;
    public static String sign;
    public static int result;


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String x = scan.nextLine();

        getNumb(x); //получаем отдельно числа
        getSign(x); //получаем отдельно знак
        checkSign(x); //проверяем количество знаков, если больше 1, то программа прерывается
        char signCh = sign.charAt(0);
        int flag = Check.checking(numb1, numb2);
        //System.out.println("Флаг равен = " + flag);


        if (flag == 1) {
            RimInArab.numb(numb1); //переводим первое римское число в арабское
            int number1 = RimInArab.y;
            RimInArab.numb(numb2); //перевод второе римское число в арабское
            int number2 = RimInArab.y;
            Check.checkRim(numb1, numb2);
            result = (Calculator.calculate(number1, number2, signCh));
            if (result < 1) {
                System.out.println("Output:");
                throw new IllegalArgumentException();
            }
            System.out.println("Output:");
            System.out.println(RomanDigit.getRimNumb());
        } else if (flag == 2) {
            int number1 = Integer.parseInt(numb1);
            int number2 = Integer.parseInt(numb2);
            Check.checkNum(numb1, numb2);
            result = (Calculator.calculate(number1, number2, signCh));
            System.out.println("Output:");
            System.out.println(result);
        } else {
            System.out.println("Output:");
            throw new IllegalArgumentException();

        }


    }

    public static void getNumb(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "*/+- ");

        int i = 0;
        while (i < 2) {
            String token = tokenizer.nextToken();
            if (i < 1)
                numb1 = token;
            else
                numb2 = token;

            i++;
        }
        // System.out.println(numb1+" "+numb2);

    }

    public static void getSign(String x) {
        StringTokenizer tokenizer = new StringTokenizer(x, "1234567890XIV ");

        while (tokenizer.hasMoreTokens()) {
            sign = tokenizer.nextToken();
        }

        //System.out.println(sign);
    }

    public static void checkSign(String x)
    {
        StringTokenizer tokenizer = new StringTokenizer(x, "1234567890XIV ");
        String[] y = new String[10];
        int i =0;
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            y[i]=token;
            i++;
        }
        String[] y1 = Arrays.copyOf(y, i);
        //System.out.println(y1.length);
        if(y1.length>1)
        {
            System.out.println("Output:");
            throw new IllegalArgumentException();
        }
    }
}