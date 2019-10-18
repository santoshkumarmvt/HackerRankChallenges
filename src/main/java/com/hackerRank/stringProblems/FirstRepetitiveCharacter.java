package com.hackerRank.stringProblems;

public class FirstRepetitiveCharacter {

    public static void main(String[] args) {
        String str = "santosh";

        for(int i=0; i<str.length()-1; i++){

            char c = str.charAt(i);
            System.out.println("c: "+c);
            for (int j=i+1; j< str.length(); j++){
                System.out.println("j: "+str.charAt(j));
                if(c == str.charAt(j)){
                    System.out.println("First repetitive character: "+c);
                    break;
                }
            }
        }
    }
}
