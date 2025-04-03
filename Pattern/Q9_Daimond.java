// package Pattern;

public class Q9_Daimond {
    public static void main(String[] args) {
        int n=5;
        int l;
        for(int i=-n;i<=n;i++){
            l=(i<0)?-i:i;
            for (int j = 0; j <= n; j++) {
                System.out.print((l<j)?"* ":" ");
            }
            System.out.println();
        }
    }
}
