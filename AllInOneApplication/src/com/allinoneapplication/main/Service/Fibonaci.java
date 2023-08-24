package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Fibonaci {
    static void fibonaci() {
        while (true) {
            System.out.println("\n\t\t\t***************fibonci series******************");
            System.out.println("enter the value ");
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();



            int a = 0, b = 1, c;
            System.out.print(a + " " + b);


            for (int i = 2; i < count; i++) {
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;


            }System.out.println("\npress 0 for exit");
            System.out.println("press 1 for continue ");
            int choice=sc.nextInt();
            if (choice== 0) {

                break;
            }



            else if (choice==1) {
                continue;

            }
        }}}