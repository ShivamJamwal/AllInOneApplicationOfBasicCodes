package com.allinoneapplication.main;

import java.util.Scanner;

public class Even_Odd {
    public Even_Odd() {
    }

    public static void evenodd() {
        int a;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("EVEN-ODD Calculator");
            System.out.println("Enter Number:");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("" + num + " is EVEN.");
            } else {
                System.out.println("" + num + " is ODD.");
            }

            System.out.println("Press 0: For back");
            a = scanner.nextInt();
        } while(a != 0);

    }
}
