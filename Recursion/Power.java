public class Power {
    public static void main(String[] args) {
        int base=2;
        int pow=5;
        System.out.println(power(base,pow));
    }

    private static int power(int base, int pow) {
      if (base==0) {
        return 0;
      }
      if (pow==1) {
        return base;
      }
      if (pow%2==0) {
        return power(base*base, pow/2);
      }else{
        return base * power(base*base, (pow-1)/2);
      }
    }
    
}
