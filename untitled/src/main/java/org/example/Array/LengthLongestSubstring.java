package org.example.Array;

import java.util.HashMap;
import java.util.Map;

public class LengthLongestSubstring {

    public static int lengthLongSubstring(String S){
        Map<Character,Integer>map= new HashMap<>();
        int left=0,maxLength=0;

        for (int right = 0; right < S.length(); right++){
            char c= S.charAt(right);

            if(map.containsKey(c) && map.get(c)>=left){
                left=map.get(c)+1;
            }
            map.put(c,right);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcdabcbb";
        System.out.println("Longest Substring Length  = " + lengthLongSubstring(s));
    }
}
