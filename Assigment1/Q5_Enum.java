import java.util.Scanner;
// 5. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum
enum Day{
  MONDAY(10), TUESDAY(50), WEDNESDAY(65), THURSDAY(88), FRIDAY(7), SATURDAY(8), SUNDAY(2);
  public int val;
  Day(int val){
     this.val=val;
   }
 }
public class Q5_Enum {
   
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter input : ");
        // int n=(sc.nextInt()-1)%7;
        // if(n<0)
        // System.out.println("invalid input");
        
        // else
        // System.out.println(Day.values()[n]);
        // Day h =new Day(7);
        for (Day d : Day.values()) {
          System.out.println(d.val);
        }
    }
    
}
