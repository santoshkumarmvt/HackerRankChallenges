package com.hackerRank.stringProblems;

import java.util.*;

public class MostFrequentSubstring {
    public static void main(String[] args) {
        String str = "abcde";

        //Find out all substrings of str
        List<String> allSubStrings = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String subStr = str.substring(i, j);
                allSubStrings.add(subStr);
            }
        }
        System.out.println("All Substring are: "+allSubStrings);

        //Find out the substring satisfying length criteria
        List<String> goodLengthSubStrings = new ArrayList<>();
        for(String s : allSubStrings){
            if(s.length()>=2 && s.length()<=5){
                goodLengthSubStrings.add(s);
            }
        }
        System.out.println("substring satisfying length criteria: "+goodLengthSubStrings);

        //Find out the substring satisfying uniqueness criteria
        List<String> max3UniqueCharsSubStrings = new ArrayList<>();
        for(String s : goodLengthSubStrings){
            Set<Character> set = new HashSet<>();
            for(char c : s.toCharArray()){
                set.add(c);
            }
            if(set.size()<=3){
                max3UniqueCharsSubStrings.add(s);
            }
        }

        System.out.println("substring satisfying uniqueness criteria: "+max3UniqueCharsSubStrings);

        //Calculate frequency of each substring
        Map<String, Integer> map = new HashMap<>();

        for(String s : max3UniqueCharsSubStrings){
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s, count+1);
            }else{
                map.put(s, 1);
            }
        }

        System.out.println(map);
        System.out.println(Collections.max(map.values()));
    }
}
