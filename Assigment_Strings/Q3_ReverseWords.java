package Assigment_Strings;

public class Q3_ReverseWords {
    public static void main(String[] args) {
        String string = "  I love my parents ";
        string = string.trim();
        StringBuilder sb = new StringBuilder();
        for (String str : string.split(" ")) {
            if(str.equals(""))
            continue;
            sb.append(reverse(str.toCharArray()));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
    private static char[] reverse(char[] charArray) {
        int s=0;
        int e=charArray.length-1;
        while (s<e) {
            char ch =charArray[s];
            charArray[s]=charArray[e];
            charArray[e]=ch;
            s++;
            e--;
        }
        return charArray;
    }
}
