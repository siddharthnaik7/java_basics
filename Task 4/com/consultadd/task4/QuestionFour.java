/**
 * 
 */
package com.consultadd.task4;

/**
 * @author siddharthnaik
 *
 */
public class QuestionFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {
				{
					1,2,3
				},
				{
					4,5,6
				}
		};
		int [][] b = {
				{
					1,2,3
				},
				{
					4,5,6
				}
		};
		int [][] c = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			int [] d = a[i];
			for(int j=0;j<d.length;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
