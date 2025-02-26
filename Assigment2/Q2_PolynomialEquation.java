package Assigment2;

import java.util.Scanner;
// 2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
public class Q2_PolynomialEquation {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number b : ");
        int b = sc.nextInt();
        System.out.println("Enter the number c : ");
        int c = sc.nextInt();
        findPolynomial(a, b, c);
    }

    private static void findPolynomial(int a, int b, int c) {
        // x=-b +- sqrt(b^2-4ac)/2a
        double sq = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (sq > 0) {
            double r1 = -b + sq / (2 * a);
            double r2 = -b - sq / (2 * a);
            System.out.println("The Root 1 : " + r1);
            System.out.println("The Root 2 : " + r2);
        } else if (sq == 0) {
            System.out.println(-b / 2 * a);
        } else {
            System.out.println("For Given Value We cant Solve Sqr Value");
        }

    }
}
