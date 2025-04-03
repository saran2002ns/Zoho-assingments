// package Pattern;

public class Q8_RombusPattern {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n+i; j++) {
                System.out.print( (j<i)?" ":" *");
            }
            System.out.println();
        }
    }
}
