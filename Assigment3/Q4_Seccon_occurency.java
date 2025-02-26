package Assigment3;
import java.util.*;
// 1. Write a program to find second occurrence of a given number in an array
public class Q4_Seccon_occurency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
      int arr[]={1,2,3,4,1,2,35,6,7,3,1,6,7,8,9,2};
      System.out.print("Enter the Target : ");
      int target=sc.nextInt();
      System.out.println(findOccurency(arr,target));
    }
    private static int findOccurency(int arr[],int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                count++;
                if (count==2) {
                    return i;
                }
            }
        }
        return -1;
    }
}
