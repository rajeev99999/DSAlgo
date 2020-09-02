package com.company.Recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationWithSpaces {
    HashSet hashSet = new HashSet();
    ArrayList arrayList = new ArrayList();
    public void getSubsets(String input,String output){

        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String output1=output;
        String output2=output;
        output2=output+input.charAt(0);
        getSubsets(input.substring(1),output1);
        getSubsets(input.substring(1),output2);

    }
    public void getUnique(String input,String output){
        if(input.length()==0){
           // System.out.println(output);
            arrayList.add(output);
            return;
        }
        String output1=output;
        String output2=output;
        output2=output+input.charAt(0);
        getUnique(input.substring(1),output1);
        getUnique(input.substring(1),output2);
    }

    public void getPermutateSpacesHelper(String input,String output){
        if(input.length()==0){
            System.out.println(output);
        }
        String output1=output;
        String output2=output;
        output1+=" "+input.charAt(0);
        output2+=input.charAt(0);
        getPermutateSpacesHelper(input.substring(1),output1);
        getPermutateSpacesHelper(input.substring(1),output2);
    }
    public void getPermutateSpaces(String input,String output){
        output = output+input.charAt(0);
        System.out.println(output);
        getPermutateSpacesHelper(input.substring(1),output);
    }

}
