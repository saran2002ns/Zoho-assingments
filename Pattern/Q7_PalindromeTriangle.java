// package Pattern;

public class Q7_PalindromeTriangle {
    public static void main(String[] args) {
        int n=5;
        int l=0;
    
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("  ");
            }
            for (int j = -i+1; j < i; j++) {
              l= (j<0)?-j:j;
                System.out.print((l+1)+" ");
            }
            System.out.println();
        }
    }
}
