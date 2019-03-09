package com.company;

public class Main {

    public static void main(String[] args) {
        int[] A = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println(" The maximum subarray starts from index " + FindMaximumSubarray(A,0, 15 )[0]
        + " to " + FindMaximumSubarray(A,0, 15 )[1] + ", and the sum is "
                + FindMaximumSubarray(A,0, 15 )[2] + ".");
    }

    public static int[] FindMaximumSubarray(int[] array, int low, int high){
        if(high == low){
            int maximum = array[0];
            int[] summary = {low, high, maximum};
            return summary;
        }
        else{
            int mid = (low+high)/2;
            int[] leftSummary = FindMaximumSubarray(array, low, mid);
            int[] rightSummary = FindMaximumSubarray(array, mid+1, high);
            int[] crossingSummary = FindMaxCrossingSubarray(array, low, mid, high);

            if(leftSummary[2]>=rightSummary[2] && leftSummary[2]>=crossingSummary[2]){
                return leftSummary;
            }else if(rightSummary[2]>=leftSummary[2] && rightSummary[2]>=crossingSummary[2]){
                return rightSummary;
            }else{
                return crossingSummary;
            }
        }
    }

    public static int[] FindMaxCrossingSubarray(int[] array, int low, int mid, int high){
       int leftSum = -9999999;
       int sum1 =0;
       int maxLeft=0;
       for(int i= mid; i>=low; i--){
           sum1 = sum1 + array[i];
           if(sum1>leftSum){
               leftSum = sum1;
               maxLeft = i;
           }
       }

        int rightSum = -9999999;
        int sum2 =0;
        int maxRight=0;
        for(int j=mid+1; j<=high; j++){
            sum2 = sum2 + array[j];
            if(sum2>rightSum){
                rightSum = sum2;
                maxRight = j;
            }
        }

        int maximum = leftSum + rightSum;
        int[] summary = {maxLeft, maxRight, maximum};
        return summary;
    }
}