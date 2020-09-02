package com.company.Stack;

import java.util.Stack;

public class CheckPalindrome {
Stack<Character> stack = new Stack<>();
public boolean isPalindrome(String string){
    for(int i=0;i<string.length();i++){
        stack.push(string.charAt(i));
    }
    String reversed="";
    while(!stack.isEmpty()){
        reversed+=stack.pop();
    }
    if(reversed.equals(string))
        return true;
    return false;
}
}

