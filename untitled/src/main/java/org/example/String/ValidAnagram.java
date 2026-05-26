package org.example.String;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagramBrut(String s,String t){

        if (s.length()!=t.length()) return false;

        char sArr[]=s.toCharArray();
        char tArr[]=t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }

    public static boolean isAnagramOpt(String s, String t) {

        if (s.length()!=t.length()) return false;
        int[]count= new int[26];

        for (int i=0; i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int c:count){
            if (c!=0) return false;
        }
        return true;
    }

    public static void main(String[]args){

        String s="listen";
        String t="silent";

        System.out.println("Strings passed is valid Anagram(Brute): " + isAnagramBrut(s,t));
        System.out.println("Strings passed is valid Anagram(Optiized): " + isAnagramOpt(s,t));


    }
}
