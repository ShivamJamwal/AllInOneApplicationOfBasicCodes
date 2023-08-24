package com.allinoneapplication.main.Service;
import java.util.Scanner;


    public class GreatestValueFinder {
        public static void man(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of values: ");
            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Invalid number of values!");
                return;
            }

            int maxValue = Integer.MAX_VALUE;

            for (int i = 0; i < count; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                int value = scanner.nextInt();

                if (value > maxValue) {
                    maxValue = value;
                }
            }

            System.out.println("The greatest value is: " + maxValue);

            scanner.close();
        }
    }

