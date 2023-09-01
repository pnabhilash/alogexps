package com.algo.experiments.arraylist.twosum.opt;

import java.util.HashSet;
import java.util.Set;

public class FindSumWithHashSet {

    public static void main(String[] args){
        //  System.out.println(findSum(new int[]{5,2,3,1},7));
      //  System.out.println(findSum(new int[]{9,-2,3,1},7));
        System.out.println(findSum(new int[]{},7));
    }


    public static boolean findSum(int[] inputs,int targetSum){
        if(inputs.length<=1) {
            System.out.println("Invalid Input array ");
            return false;
        }
        Set<Integer> tempSet=new HashSet<>();
        tempSet.add(inputs[0]);

        for(int k=1;k<inputs.length;k++){
                int delta=targetSum-inputs[k];
                if(tempSet.contains(delta)) {
                    System.out.println(" pairs [k] " + delta + " pair[y] " + inputs[k]);
                    return true;
                }
        }

        return false;
    }
}