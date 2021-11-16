package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        int k = 0;
        while (true) {
            int i = (int)(Math.random()*10);
            if (i == 1) break;
            k++;
        }
        System.out.printf("Solution #1: %d\n", k);
        //2
        double y;
        System.out.println("Solution #2:");
        for (double x = -2.0, i = 1; x < 2.0; x+=0.2, i++) {
            y = (Math.pow(x, x - 1) - 1) * (Math.pow(x, x + 1) + 1);
            System.out.printf("Result #%.0f: %.2f\n", i, y);
        }
        //3
        Scanner in1 = new Scanner(System.in);
        double x1, sum = 0.0;
        for (int i = 0; i < 10; i++) {
            x1 = in1.nextFloat();
            int x2 = (int)x1;
            double x3 = (double)(x1 - x2);
            sum += x3;
        }
        System.out.printf("Solution #3: %f\n", sum);
        //4
        Scanner in2 = new Scanner(System.in);
        String str, minStr = "";
        int f = 100;
        do {
            str = in2.nextLine();
            if (str.length() < f) {
                minStr = str;
                f = minStr.length();
            }
        } while (!Objects.equals(str, "done"));
        System.out.printf("Solution #4: %s", minStr);
    }
}
