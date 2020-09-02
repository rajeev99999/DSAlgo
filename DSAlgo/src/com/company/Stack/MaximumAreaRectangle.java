package com.company.Stack;

public class MaximumAreaRectangle {
    public int getMaxAreaInBinaryMatrix(int array[][]){
        MaximumAreaUnderHistogram mh = new MaximumAreaUnderHistogram();

        int h1[] = new int[4];
        int h2[] = new int[4];
        int h3[] = new int[4];
        int h4[] = new int[4];
        for(int i=0;i<4;i++){
            h1[i] = array[0][i];
        }
        for(int i=0;i<4;i++){
            h2[i]=(array[1][i]!=0)?(h1[i]+array[1][i]):0;
        }
        for(int i=0;i<4;i++){
            h3[i]=(array[2][i]!=0)?(h2[i]+array[2][i]):0;
        }
        for(int i=0;i<4;i++){
            h4[i]=(array[3][i]!=0)?(h3[i]+array[3][i]):0;
        }
//        for (int i = 0; i < 4; i++) {
//            System.out.print(h3[i]+" ");
//        }
//        System.out.println();
//        System.out.println(mh.maximumArea(h3));
        int maxArea1 = Math.max(mh.maximumArea(h1),mh.maximumArea(h2));
        int maxArea2 = Math.max(mh.maximumArea(h3),mh.maximumArea(h4));
        int maxArea  = Math.max(maxArea1,maxArea2);
        return maxArea;
    }
}
