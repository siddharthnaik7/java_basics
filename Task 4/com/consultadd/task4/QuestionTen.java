/**
 * 
 */
package com.consultadd.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddharthnaik
 *
 */
public class QuestionTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {-45,-13,-12,5,24,64,27,1};
		List<Integer> posList = new ArrayList<Integer>();
		List<Integer> negList = new ArrayList<Integer>();
		List<Integer> sumList = new ArrayList<Integer>();
		List<Integer> pairLeft = new ArrayList<Integer>();
		List<Integer> pairRight = new ArrayList<Integer>();
		
		for(int i:a) {
			if(i>0) {
				posList.add(i);
			}else if(i<0) {
				negList.add(i);
			}
		}
		
		for(int i=0;i<posList.size();i++) {
			for(int j=0;j<negList.size();j++) {
				sumList.add(Math.abs(negList.get(j)+posList.get(i)));
				pairLeft.add(posList.get(i));
				pairRight.add(negList.get(j));
			}
		}
		
		int min = 9999;
		int index = 0;
		for(int i=0;i<sumList.size();i++) {
			if(sumList.get(i)<=min) {
				min=sumList.get(i);
				index=i;
			}
		}
		//System.out.println(index);
		System.out.println("("+ pairLeft.get(index) + "," + pairRight.get(index) +")");
		//System.out.println(sumList);
		
	}

}
