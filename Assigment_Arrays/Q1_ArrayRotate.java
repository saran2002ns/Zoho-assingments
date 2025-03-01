package Assigment_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_ArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int m=arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the number to rotate : ");
        int n=sc.nextInt();
        n=n%m;
        reverse(0,n-1,arr);
        reverse(n,m-1,arr);
        reverse(0,m-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int start, int end, int[] arr) {
       while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
    }
}
