// 3. Create multiple classes in single file and compile and explore how many .class files are generated.

public class Q3_MultiClass {
    public static void main(String[] args) {
        System.out.println("In public class");
    }
}
class A{
    public static void main(String[] args) {
        System.out.println("In Class A");
    }
}
