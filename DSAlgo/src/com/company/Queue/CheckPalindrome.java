package com.company.Queue;

import sun.text.normalizer.UCharacter;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindrome {
    Queue<Character> queue = new LinkedList<>();
    public void checkPalindrome(String input){
        String string=" ";
        for(int i=input.length()-1;i>=0;i--)
            queue.add(input.charAt(i));
        while (!queue.isEmpty()){
            string+=queue.remove();
        }
        if(string.equals(input)){
            System.out.println("The given input is a palindrome");
        }
        else{
            System.out.println("The given input is not a palindrome");
        }
    }
}

