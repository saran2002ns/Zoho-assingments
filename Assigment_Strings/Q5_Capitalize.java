package Assigment_Strings;

public class Q5_Capitalize {
    public static void main(String[] args) {
        String string = "  I love my parents ";
        string = string.trim();
        StringBuilder ans = new StringBuilder();
        for (String str : string.split(" ")) {
            if (!str.isEmpty()) {
                StringBuilder sb = new StringBuilder(str);
                if (Character.isLetter(str.charAt(0))) {
                    sb.setCharAt(0, Character.toUpperCase(str.charAt(0)));
                }
                ans.append(sb);
                ans.append(" ");
            }
        }
        System.err.println(ans.toString());
    }
}
