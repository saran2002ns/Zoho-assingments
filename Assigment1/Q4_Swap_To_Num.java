// 4. Write a program to swap the two given numbers
public class Q4_Swap_To_Num {
    public static void main(String[] args) {
        int a=4;
        int b=7;
    
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

        a=4;
        b=7;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);

        a=4;
        b=7;
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);



    }
    
}
