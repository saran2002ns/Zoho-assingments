package Assigment3;

import java.util.Scanner;
// 1. Take three numbers from the user and print the greatest number.

public class Q1_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int n1=sc.nextInt();
        System.out.print("Enter second Number : ");
        int n2=sc.nextInt();
        System.out.print("Enter third Number : ");
        int n3=sc.nextInt();
        System.out.println("The Greater Number  "+(n1>n2?n1>n3?n1:n3:n2>n3?n2:n3));
    }
}
