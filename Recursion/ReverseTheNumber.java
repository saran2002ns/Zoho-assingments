public class ReverseTheNumber {
    public static void main(String[] args) {
        int num=3672;
        System.out.println( reverse(num,0));
       
    }
    private static int reverse(int num,int sum){
        if (num==0) {
            return sum;
        }
        return  reverse(num/10,sum*10+num%10);
    }
}
