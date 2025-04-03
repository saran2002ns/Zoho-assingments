

public class DigitsToWords {
    private static String word(int num){
        switch (num) {
            case 0:return "zero";
            case 1: return"one";
            case 2: return"two";
            case 3: return"three";
            case 4: return"four";
            case 5: return"five";
            case 6: return"six";
            case 7: return"seven";
            case 8: return"eight";
            case 9: return"nine";
        }
        return "";
    }
    public static void main(String[] args) {
        int num=5289;
        recursive(num);
    }
    private static void recursive(int num){
        if (num==0) {
            return;
        }
        System.err.println(word(num%10));
        recursive(num/10);
    }
}
