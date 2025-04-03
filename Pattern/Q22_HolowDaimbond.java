public class Q22_HolowDaimbond {
    public static void main(String[] args) {
        int n=5;
        int l;
        for(int i=-n;i<=n;i++){
            l=(i<0)?-i:i;
            for (int j = 0; j <= n; j++) {
                if(l<j){
                    if (l==j-1||j==n) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
