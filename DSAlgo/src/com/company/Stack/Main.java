package com.company.Stack;

import com.company.Recursion.*;
import com.company.Recursion.SortArray;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer array[]={6,2,5,4,5,1,6};
        int array2[] = {2,3,3,2};
        int array2d[][] = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        List<Integer> list= new ArrayList<Integer>(Arrays.asList(array));
        NextSmallestToLeft n = new NextSmallestToLeft();
        NextSmallestToright n2 = new NextSmallestToright();
        MaximumAreaUnderHistogram m = new MaximumAreaUnderHistogram();
        MaximumAreaRectangle mr = new MaximumAreaRectangle();
        Factorial factorial = new Factorial();
        SortArray sortArray= new SortArray();
        PermutationWithSpaces p = new PermutationWithSpaces();
        p.getSubsets("abc"," ");

        int ans[] = n.nextSmallestToleft(array2);
        int ans2[] = n2.nextSmallestToright(array2);
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
        System.out.println();
   //     System.out.println(m.maximumArea(array));
        System.out.println(mr.getMaxAreaInBinaryMatrix(array2d));
        System.out.println(factorial.factorial(5));

    }
}
