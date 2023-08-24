package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Pass_Fail {
    public Pass_Fail() {
    }

    public static void pass_fail() {
        int a;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("PASS-FAIL Calculator");
            System.out.println("Enter marks:");
            int marks = scanner.nextInt();
            if (marks > 33) {
                System.out.println("" + marks + " is PASS.");
            } else {
                System.out.println("" + marks + " is FAIL.");
            }

            System.out.println("Press 0: For back");
            a = scanner.nextInt();
        } while(a != 0);

    }
}
