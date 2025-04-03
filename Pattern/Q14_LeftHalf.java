// package Pattern;

public class Q14_LeftHalf {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
               System.out.print((j<n-i)?"  ":"* ");
            }
            System.out.println();
        }
    }
}
