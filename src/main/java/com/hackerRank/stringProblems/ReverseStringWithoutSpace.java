package com.hackerRank.stringProblems;

public class ReverseStringWithoutSpace {

    public static void main(String[] args) {
        String str = "I am Santosh and I live in Pune";
        int len = str.length();
        char[] input = str.toCharArray();
        char[] result = new char[len];

        for(int i=0; i<len; i++){
            if(input[i] == ' '){
                result[i] = ' ';
            }
        }

        int j = len-1;
        for(int i=0; i<len; i++){
            if(input[i] != ' '){
                if(result[j] == ' '){
                    j--;
                }
                result[j] = input[i];
                j--;
            }
        }

        System.out.println(String.valueOf(input));
        System.out.println(String.valueOf(result));
    }
}
