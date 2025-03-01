package Assigment_Arrays;

import java.util.Scanner;

public class Q5_JaggedArrayWeights {

    public static int getMinWeight(int[] weights) {
        int minWeight = weights[0]; 
        for (int weight : weights) {
            if (weight < minWeight) {
                minWeight = weight;
            }
        }
        return minWeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        int[][] weights = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int numWeights = sc.nextInt();
            weights[i] = new int[numWeights];
        }
        System.out.println("Enter the weights for each person:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < weights[i].length; j++) {
                System.out.print("Enter weight " + (j + 1) + " for person " + (i + 1) + ": ");
                weights[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the person index to calculate the minimum weight (1 to " + n + "): ");
        int personIndex = sc.nextInt() - 1; 
        if (personIndex < 0 || personIndex >= n) {
            System.out.println("Invalid person index!");
        } else {
            int minWeight = getMinWeight(weights[personIndex]);
            System.out.println("The minimum weight of person " + (personIndex + 1) + " is: " + minWeight);
        }
    }
}

