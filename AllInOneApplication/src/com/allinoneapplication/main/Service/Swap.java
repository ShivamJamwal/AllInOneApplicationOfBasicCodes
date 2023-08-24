package com.allinoneapplication.main.Service;

import java.util.Scanner;

public class Swap {
    static void swap(){
        while(true){
        Scanner sc=new Scanner(System.in);

        System.out.println("Press 1 for swapping with third variable");
        System.out.println("press 2 for swapping without third variable");
            int choice=sc.nextInt();
               if(choice==1){
                   System.out.println("enter value of a");
                   int a=sc.nextInt();
                   System.out.println("enter value of b");
                   int b=sc.nextInt();
                  System.out.println("values before swapping A:"+a +"\n B:"+b);
                   int c = 0;
                   c=a;
                   a=b;
                   b=c;
                   System.out.println("values after swapping A:"+a + "\n B:" +b);
                   System.out.println("press 0 for exit");


               }
               else if(choice==2 ){
                   System.out.println("enter first value");
                   int a=sc.nextInt();
                   System.out.println("enter second value");
                   int b=sc.nextInt();
                   System.out.println("values before swapping A:"+a +"\n B:"+b);
                   a=a+b;
                   b=a-b;
                   a=a-b;
                   System.out.println("values after swapping A:"+a +"\n B:"+b);
                   System.out.println("press 0 for exit");
               }

                else if(choice==0){
                   break;

               }
    }
}}
