public class Q15_ReverseLeft {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
               System.out.print((j < i)?"  ":"* ");
            }
            System.out.println();
        }
    }
}
