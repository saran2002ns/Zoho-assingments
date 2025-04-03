public class Binnary {
    public static void main(String[] args) {
        int num=5;
        find(num);
    }

    private static void find(int num) {
        if (num==0) {
            return;
        }
        find(num>>1);
        System.out.print((num&1)==0 ? 0:1);
    }
}
