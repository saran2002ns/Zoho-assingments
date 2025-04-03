public class Q18_RevereNumber {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print((j < i)?" ":j+1+" ");
            }
            System.out.println();
        }
    }
}
