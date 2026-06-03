package org.example.String;

import java.util.Arrays;

public class ReverseString {

    public static void reverseStringBrute(char[] s){
        char temp[]=new char[s.length];
        int j=0;
        for (int i=s.length-1;i>=0;i--){
            temp[j++]=s[i];
        }
        for (int i=0;i<s.length;i++){
            s[i]=temp[i];
        }
    }

    public static void reverseStringOpt(char[] s){
        int left=0; int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[]args){
        char[]s={'h','e','l','l','o'};
        char[] s1 = {'H','a','n','n','a','h'};

        reverseStringBrute(s);
        System.out.println("Reversed string(Brute): "+ Arrays.toString(s));
        reverseStringOpt(s1);
        System.out.println("reversed string(Opt): "+ Arrays.toString(s1));
    }
}
