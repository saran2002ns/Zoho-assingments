public class Q25_RigfhtPasacal {
    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+j)%2==0 && i>=j && (i+j)<=n) {
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
               
            }
            System.out.println();
        }
    }
}
