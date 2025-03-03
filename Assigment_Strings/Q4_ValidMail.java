package Assigment_Strings;

import java.util.Scanner;

public class Q4_ValidMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
        
       
    }
    private static boolean isValid(String s) {
        if(s.length()<5)
        return false;
        int a=0;
        int p=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@')
            a++;
            else if(s.charAt(i)=='.')
            p++;
        }
        if( a!=1 || p!=1||s.indexOf('.')!=s.length()-4||s.indexOf('@')>s.indexOf('.'))
        return false;
        return true;
    }
}
