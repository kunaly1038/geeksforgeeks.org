/**
Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a integer n. Second line consists of n*n spaced integers. Third and last line consists of n spaced integers.

Output: Print the sum of the diagonal elements and the maximum number of the 1-d array with spaces in between.

Constraints:

1<=T<=100
1<= n <=100
1<=element<=103


Example:

Input:
1
3
1 2 3 4 5 6 7 8 9
3 6 9

Output:
15 9
**/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int sum=0,max=0;
		    int [][]x =new int[a][a];
		    int []y = new int[a];
		    for(int i=0; i<x.length;i++){
		        for(int j=0;j<x.length;j++){
		            x[i][j] = sc.nextInt();
		        }
		    }
		    for(int i=0; i<y.length;i++){
		        y[i]= sc.nextInt();
		    }
		    for(int i=0; i<x.length;i++){
		        for(int j=0;j<x.length;j++){
		            if(i==j){
		                sum = sum + x[i][j];
		            }
		        }
		    }
		    max = y[0];
		    for(int k=0;k<y.length;k++){
		        if(max < y[k]){
		            max = y[k];
		        }
		    }
		    System.out.println(sum+" "+max);
		}
	}
}
