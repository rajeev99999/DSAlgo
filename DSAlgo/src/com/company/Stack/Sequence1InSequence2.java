package com.company.Stack;

import java.util.Stack;

public class Sequence1InSequence2 {
    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student

        while(!sequence1.isEmpty() && !sequence2.isEmpty()){
            if(sequence1.peek()==sequence2.peek()){
                sequence1.pop();
                sequence2.pop();
            }
            else
            {
                if(!sequence2.isEmpty()){
                    sequence2.pop();
                }
                else{
                    // return false;
                    break;
                }
            }
        }
        if(sequence1.isEmpty()){
            return true;
        }
        return false;
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line1 = scanner.nextLine();
//        String line2 = scanner.nextLine();
//        Stack<Integer> sequence1 = new Stack<Integer>();
//        Stack<Integer> sequence2 = new Stack<Integer>();
//        int boxIndex = 0;
//        for (String elem1 : line1.split(" ")) {
//            sequence1.add(Integer.parseInt(elem1));
//        }
//        for (String elem2 : line2.split(" ")) {
//            sequence2.add(Integer.parseInt(elem2));
//        }
//        Boolean isSubsequence = contains(sequence1, sequence2);
//        System.out.println(isSubsequence);
//    }
}
