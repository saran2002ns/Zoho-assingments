public class Q20_Hollow {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                if (j<n-i) {
                    System.out.print(" ");
                }else{
                    if (j==n-i || j==n || i==n-1) {
                        System.out.print("* ");
                    }else{
                       System.out.print("  ");
                    }
                   
                }
            //    System.out.print((j<n-i)?" ":"* ");
            }
            System.out.println();
        }
    }
}
