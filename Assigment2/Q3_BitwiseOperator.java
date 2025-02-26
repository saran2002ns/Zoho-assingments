package Assigment2;
// 3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
public class Q3_BitwiseOperator {
    public static void main(String[] args) {
      
        int a = 1;
        int b = 2;
        System.out.println(a | b);// 0001 | 0010 -> 0011 ->3
        System.out.println(a & b);// 0001 & 0010 -> 0000 ->0
        System.out.println(a ^ b);// 0001 ^ 0010 -> 0011 ->3
        System.out.println(a >> b);// 0001 >> 2 -> 0000 ->0
        System.out.println(a >>> b);// 0001 >> 2 -> 0000 ->0
        System.out.println(a << b);// 0001 << 2 -> 0010 ->4
        System.out.println(~b);// 0010-> 1101 -> -0010+1 -> -0011 -> -3
    
    }
}
