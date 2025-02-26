package Assigment2;
// 4. Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope.
//  (Comment the compiler error in your program while submitting)

public class Q4_If {
    public static void main(String[] args) {
        int k=8;
        if(true){
          //  int k=6;
        }
    }
}
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//         Duplicate local variable k