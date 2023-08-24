package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Temp {
    static Scanner sc = new Scanner(System.in);
    static void temp() {
        while (true) {
            System.out.println("press 1for farnehit to celcius \n press 2for  celcius to farnehit \n 0 to exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("farnehit to celcius");

                double con = sc.nextDouble();
                double a = (con - 32) * 5 / 9;
                System.out.println(a);
            } else if (choice == 2) {


                System.out.println("celcius to farnehiet");
                double hike = sc.nextDouble();
                double lo = (hike * 9 / 5) + 32;
                System.out.println(lo);
            } else if (choice == 0) {
                break;

            }

        }

    }
}

