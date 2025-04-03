public class GCD {
    public static void main(String[] args) {
        int num1=48;
        int num2=18;
        System.out.println(recursive(num1,num2));
    }

    private static int recursive(int num1, int num2) {
        if (num1==0 || num2==0) {
            return num1==0?num2:num1;
        }
        if (num1>num2) {
           return recursive(num1%num2, num2);
        }else{
           return recursive(num1, num2%num1);
        }
    }
}
