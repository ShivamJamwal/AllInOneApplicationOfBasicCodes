package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Prime {
    static void prime() {
        while (true) {
            System.out.println("enter the value to check its a prime number or not");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int m, flag;
            m = a / 2;
            flag = 0;
            if (a == 0 || a == 1) {
                System.out.println("not a prime number");
            } else {
                for (int i = 2; i <= m; i++) {
                    if (a % i == 0) {
                        System.out.println("not a prime number");
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {
                    System.out.println("is a prime number ");
                }
            }
            System.out.println("press 0 for exit");
            int g = sc.nextInt();
            if (g == 0) {
                break;
            }
        }
    }
}