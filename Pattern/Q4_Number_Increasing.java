// package Pattern;

public class Q4_Number_Increasing {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
