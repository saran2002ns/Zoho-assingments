package Assigment3;

import java.util.Scanner;
// 2. Write a program to print prime numbers between 1 to 30
public class Q5_PrimeNumbers {
    public static void main(String[] args) {
      
        System.out.print("The Prime Numers : ");
        
        for(int i=1;i<=30;i++){
            if(i==2||i==3||i==5||i==7||(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)){
                System.out.print(i+" ");
            }
        }
    }
}
