package com.allinoneapplication.main.Main;
import com.allinoneapplication.main.Even_Odd;
import com.allinoneapplication.main.Pass_Fail;
import com.allinoneapplication.main.Service.Factorial;
import com.allinoneapplication.main.Service.Fibonaci;
import com.allinoneapplication.main.Service.Palindrome;
import com.allinoneapplication.main.Service.Prime;
import com.allinoneapplication.main.Service.Swap;
import com.allinoneapplication.main.Service.Temp;

import java.util.Scanner;
public class AllInOneApplicationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu________");
            System.out.println("Press\n1 To check EVEN-ODD\n2 To check If Student is PASS or FAIL\n3 To  convert the Temperature \n4 To check the Prime Number\n5 To check the Facorial" +
                    "\n6 To Swaping two number\n7 To check the Fibonacci series\n8 To check the number is Palindrome or not\n 0To QUIT ");

            System.out.println("Enter Choice:");
            int choice = scanner.nextInt();


            if (choice == 0) {
                System.out.println("Thank you!!!!");
                break;

            }

            if (choice == 1) {
                Even_Odd.evenodd();


            } else if (choice == 2) {
                Pass_Fail.pass_fail();


            } else if (choice == 3) {
                Temp.temp();
            } else if (choice == 4) {
                Prime.prime();
            } else if (choice == 5) {
                Factorial.factorial();


            } else if (choice == 6) {
                Swap.swap();
            } else if (choice == 7) {
                Fibonaci.fibonaci();
            } else if (choice==8) {
                Palindrome.palindrome();
                
            } else if(choice==8) {
            }
            System.out.println("END");


        }
    }

}
