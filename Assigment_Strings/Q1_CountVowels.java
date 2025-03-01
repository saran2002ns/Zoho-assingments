package Assigment_Strings;

import java.util.HashMap;
import java.util.Set;

public class Q1_CountVowels {
//   private static Set<Character> set = Set.of('a', 'e','i','o','u');
    public static void main(String[] args) {
        String vowels="aeiou";
        String string = "I love my parents";
        int count=0;
        for (char ch : string.toCharArray()) {{}
            if(Character.isLetter(ch)&& vowels.contains(Character.toLowerCase(ch)+"")){
                count++;
            }
        }
        System.out.println(count);
    }
}
