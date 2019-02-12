package com.company;

import java.util.Scanner;

public class CheckPalindrome {

    public static void palindrome (){
        Scanner sc = new Scanner(System.in);
        long n,orig,sum=0,rem,rev=0,chk_even=0;// write your code here
        System.out.println("Enter no.");
        n= sc.nextLong();
        orig=n;
        while(n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(rev == orig) {

            chk_even = orig % 10;
             chk_even=chk_even%2;

             if(chk_even==0) {
                 sum = sum + 0;

                 if(chk_even>25) {
                     System.out.println(chk_even + "is palindrome and sum of even no is greater than 25");
                 }

             }
             else
                 {
                 System.out.println(chk_even + "is palindrome  but sum of even no is less than 25");
             }

        }
        else
            {
            System.out.println(sum + " is not a palindrome");
        }

             }
        }



