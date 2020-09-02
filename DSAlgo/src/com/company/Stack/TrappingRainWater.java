package com.company.Stack;

import java.util.Stack;

public class TrappingRainWater {
    Stack<Integer> stack = new Stack<>();

    public int getTrappedWaterLevelusingStack(int [] height){
        int area =0;
        for(int i=0;i<height.length;i++){
            while (!stack.isEmpty() && height[stack.peek()]>height[i]){
                int top = stack.peek();
                stack.pop();
              int  distance = i-top-1;
              int   bounded_height = Math.min(height[i],height[stack.peek()]) - height[top];
              area += distance*bounded_height;
            }
            stack.push(i);
        }
        return area;
    }

    public int getTrappedWaterUsing3Arrays(int height[]){
        int n= height.length;
        int area =0;
        int left [] = new int[n];
        int right [] = new int[n];

        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
            area += Math.min(left[i],right[i])-height[i];
        }
        return area;
    }
}
