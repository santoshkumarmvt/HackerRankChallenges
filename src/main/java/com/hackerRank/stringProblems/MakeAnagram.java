package com.hackerRank.stringProblems;

public class MakeAnagram {
//    String s1 = "cde";
//    String s2 = "dcf";

    public int findFrequency(String str, char c){
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)) {
                ++frequency;
            }
        }
        return frequency;
    }
    public int countOfCharsToBeDeleted(String s1, String s2){
        int count = 0;
        for(int i=0; i<s1.length(); i++){
            String c = s1.substring(i, i+1);
            System.out.println("Char: "+c);
            if(! c.equals("`")){

                int freqOfCinS1 = findFrequency(s1, c.charAt(0));
                int freqOfCinS2 = findFrequency(s2, c.charAt(0));

                System.out.println("Freq in s1: "+freqOfCinS1+", Freq in s2: "+freqOfCinS2);

                int mismatchCount = Math.abs(freqOfCinS1 - freqOfCinS2);

                count += mismatchCount;

                s1 = s1.replace(c, "`");
                s2 = s2.replace(c, "`");
            }
        }

        System.out.println("s2 after processing: "+s2);
        s2 = s2.replace("`", "");

        return count + s2.length();
    }

    public static void main(String[] args) {
        MakeAnagram ma = new MakeAnagram();
        int count = ma.countOfCharsToBeDeleted("cde", "dcf");
        System.out.println("Characters to be deleted to make anagram: "+count);
    }
}
