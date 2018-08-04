/**
Given two numbers you will have to check whether the first number is greater than or less than or equals to the second number.

Input: 
First line of input contains an integer T, which denotes the number of test cases. First line of each test case contains two space separated integers A and B.
 

Output:
If A > B then print "A is greater than B" without quotes
If A < B then print "A is less than B" without quotes
if A = B then print "A is equals to B" without quotes

Constraints:
1<=T<=100
1<=A,B<=1000

Example:
Input:
2
90 5
182 234

Output:
90 is greater than 5
182 is less than 234
**/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x>y){
		        System.out.println(x+" is greater than "+y);
		    }
		    else if(x == y){
		        System.out.println(x+" is equals to "+y);
		    }
		    else{
		        System.out.println(x+" is less than "+y);
		    }
		}
	}
}
