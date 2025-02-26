package Assigment3;

import java.util.Scanner;
// 2. Create a program that takes a student's score as input and outputs their corresponding grade

public class Q2_Mark_toGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mark out of 100 : ");
        int mark=sc.nextInt();
        if(0>mark || 100<mark)
        System.out.println("Invalid mark");
        else{
            System.out.println(grade((mark-mark%10 )/10+1));

        }

    }
    private static String grade(int num){
        switch (num) {
            case 10:return "O";
            case 9:return "A+";
            case 8:return "A";
            case 7:return "B+";
            case 6:return "B";
            case 5:return "C+";
            case 4:return "C";
        
            default:return "Fail";
        }
    }
}
