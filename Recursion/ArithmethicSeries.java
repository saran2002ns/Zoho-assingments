public class ArithmethicSeries {
    public static void main(String[] args) {
        int num=5;
        System.out.println(recursive(num));
    }
    private static int recursive(int num){
        if (num==0) {
            return 0;
        }
        return num+recursive(num-1);
    }
}
