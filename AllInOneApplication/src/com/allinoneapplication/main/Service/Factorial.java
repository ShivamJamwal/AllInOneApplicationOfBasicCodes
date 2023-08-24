package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Factorial {
    static void factorial() {
        while (true) {
            System.out.println("enter the number to know the factorial number ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 1; i <= 5; i++) {
                a = a * i;
            }
            System.out.println("the factorial is" + a);
            System.out.println("press o for exit");
            int f = sc.nextInt();
            if (f == 0) {


                break;

            }
        }
    }

}
