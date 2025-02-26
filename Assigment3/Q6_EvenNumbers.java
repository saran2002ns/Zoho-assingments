package Assigment3;
// 3. Write a program to find the sum of even numbers only in a given array. Use continue.

public class Q6_EvenNumbers {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        for(int n : arr){
            if ((n&1)==1) {
                continue;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}
