public class Q21_HollowReverse {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if ((j >= i)) {
                    if (j==i||i==0||j==n-1) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    System.out.print(" ");
                }
            //    System.out.print((j < i)?" ":j+1+" ");
            }
            System.out.println();
        }
    }
}
