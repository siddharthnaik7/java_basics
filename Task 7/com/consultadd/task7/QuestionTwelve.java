/**
 * 
 */
package com.consultadd.task7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTwelve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTwelve q12 = new QuestionTwelve();
//		int [] arr = {10, 2, -2, -20, 10};
//		int sum = -10
		int arr[] = { 3, 4, -7, 1, 3, 3, 1, -4 }; 
        int sum = 7; 
		System.out.println(q12.subArraySum(arr, sum));
		
	}
	
	List<List<Integer>> subArraySum(int[] arr, int sum) 
    { 
        List<List<Integer>> llI = new ArrayList<List<Integer>>();
        
        
        for (int i = 0; i < arr.length; i++)
        {
            int sum_so_far = 0;
 
            // consider all subarrays starting from `i` and ending at `j`
            for (int j = i; j < arr.length; j++)
            {
                // sum of elements so far
                sum_so_far += arr[j];
 
                // if the sum so far is equal to the given sum
                if (sum_so_far == sum) {
                	List<Integer> lI = new ArrayList<Integer>();
                    for(int k=i;k<=j;k++) {
                    	lI.add(arr[k]);
                    }
                    llI.add(lI);
                }
            }
        }
        return llI;
    }
}
