package com.company.Stack;

public class MaximumAreaUnderHistogram {
    public int maximumArea(int height[]){
        NextSmallestToLeft nsl = new NextSmallestToLeft();
        NextSmallestToright nsr = new NextSmallestToright();
        int nsl1[] = nsl.nextSmallestToleft(height);
        int nsr1[] = nsr.nextSmallestToright(height);
        int ans[] = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            ans[i]=(nsr1[i]-nsl1[i]-1) * height[i];
        }
        int max= Integer.MIN_VALUE;
        for (int i = 0; i <ans.length ; i++) {
            if(ans[i]>max)
                max=ans[i];
        }
    return max;
    }
}
