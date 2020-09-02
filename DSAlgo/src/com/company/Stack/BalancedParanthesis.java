package com.company.Stack;

import java.util.Stack;

public class BalancedParanthesis {
    public char Tokensc[][] = {{'{','}'},{'(',')'},{'[',']'}};

    public  boolean openExp(Character c){
        for(char[] array: Tokensc){
            if(array[0]==c){
                return true;
            }
        }
        return false;
    }
    public boolean match(Character openExp, Character closeExp){
        for (char array[] : Tokensc){
            if(array[0]==openExp){
                return array[1]==closeExp;
            }
        }
        return false;
    }
    public boolean isBalancedParanthesis(String expression){
        Stack<Character> stack= new Stack<Character>();
        for(char c: expression.toCharArray()){
            if(openExp(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || !match(stack.pop(),c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
