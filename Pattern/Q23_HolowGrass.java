public class Q23_HolowGrass {
    public static void main(String[] args) {
        int n=3;
    int l;
    for(int i=-n;i<=n;i++){
        l=(i<0)?-i:i;
        for (int j = 0; j < n-l; j++) {
            System.out.print(" ");
            
        }
        for (int j = 0; j <= l; j++) {
            if (j==0||j==l||l==n) {
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
           
        }
        System.out.println();
    }
    }
}
