import java.util.Scanner;
// 5. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum
public class Q5_Enum {
   private  enum Day{
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n=(sc.nextInt()-1)%7;
        if(n<0)
        System.out.println("invalid input");
        
        else
        System.out.println(Day.values()[n]);
    }
    
}
