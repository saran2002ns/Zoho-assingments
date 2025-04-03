public class Q24_PascalTriangle {
    public static void main(String[] a) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) System.out.print(" ");
            
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
