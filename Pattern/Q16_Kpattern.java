public class Q16_Kpattern {
    public static void main(String[] args) {
        int n=3;
        int l;
        for(int i=-n;i<=n;i++){
            l=(i<0)?-i:i;
            for (int j = 0; j <= l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
