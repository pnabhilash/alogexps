package com.algo.experiments.arraylist.twosum.brute;

public class FindSum {


    public static void main(String[] args){
      //  System.out.println(findSum(new int[]{5,2,3,1},7));
        System.out.println(findSum(new int[]{9,-2,3,1},7));
    }


    public static boolean findSum(int[] inputs,int targetSum){
        if(inputs.length<=1) return false;
        for(int k=0;k<inputs.length-1;k++){

            for(int y=k+1;y<inputs.length;y++){
                if(inputs[k]+inputs[y]==targetSum){
                    System.out.println(" pairs [k] "+inputs[k]+ " pair[y] "+inputs[y]);
                    return  true;
                }
            }


        }

        return false;
    }
}
