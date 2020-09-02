package com.company.Recursion;

import java.util.ArrayList;

public class SortArray {
    public void insert(ArrayList<Integer> list,int num){
        if(list.size()==0 || list.get(list.size()-1)<=num){
            list.add(num);
            return;
        }
        int popped=list.remove(list.size()-1);
        insert(list,num);
        list.add(popped);
    }
    public void sortArray(ArrayList<Integer> list,int size){
       if(size==0){
           return;
       }
        int temp = list.remove(list.size()-1);
        sortArray(list,list.size()-1);
        insert(list,temp);
    }
}
