package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(){
                while (true) {
                    System.out.println("Press 1 for check the number is palindrome or not");
                    System.out.println("Press 0 for exit");
                    Scanner sc = new Scanner(System.in);
                    int choice =sc.nextInt();
                    if (choice==1){
                        System.out.println("enter the number");
                        int input = sc.nextInt();
                        if (input == 0) {
                            break;
                        }
                        int b, sum = 0;
                        int a = input;
                        while (a > 0) {
                            b = a % 10;
                            sum = (sum * 10) + b;
                            a = a / 10;
                        }
                        if (sum == input) {
                            System.out.println("Number is palindrome ");
                        }
                        else {
                            System.out.println("Number is not palindrome");
                        }}
                    if (choice==0){
                        break;
                    }
                }
            }
        }


