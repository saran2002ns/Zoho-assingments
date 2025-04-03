import java.util.Scanner;
// 6. Write a program that calculates the average weight of 10 people. 
// Use descriptive and meaningful variable names following Java naming conventions. 
// Use proper datatypes for the variables.
public class Q6_Average_Weight {
    public static void main(String[] args) {
      //  int n=10;
        Double average=0.0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Weight of Person "+i+" ");
            average+=sc.nextDouble();
        }
        System.out.printf("Average : %.2f",average/10.0);
    }
}
