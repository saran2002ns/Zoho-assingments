package Assigment3;

import java.util.Scanner;
// 3. Write a program to print multiplication table of a given number in a neat forma

public class Q3_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the val : ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(""+i+" X "+n+" = "+(i*n));
        }
    }
}
