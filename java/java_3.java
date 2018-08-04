/**
Given two integers,m and n. Your task is to check whether m!=n or m=n.

Input:
First line of input file contains an integer T, denoting the number of test cases. Then T test case follow. First line of each test case contains two integer m and n.(space separated).

Output:
For each test case, Print lesser, greater or equal  for m!=n, or m=n respectively in new line.

Constraints:
1<=T<=10
-100<=m<=100
-100<=n<=100

Example:
Input:
3
4 8
4 4
-2 -5
Output:
lesser
equal
greater
**/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    if(m>n){
		        System.out.println("greater");
		    }
		    else if(m == n){
		        System.out.println("equal");
		    }
		    else{
		        System.out.println("lesser");
		    }
		    
		}
	}
}
