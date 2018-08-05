/**
Given two strings S and A . Print "1" if both strings are anagrams otherwise print "0" .

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a string S. Second and last line of each test case consists of string A.

Output: Corresponding to each test case, print the required output.

Constraints:

1<=T<=100
1<= length(S and A) <=1000


Example:

Input:
2
cdbkdub
dsbkcsdn
geeks
skgee
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
		    
		    String a = sc.next();
		    String b = sc.next();
		    if(a.length()!=b.length()){
		        System.out.println("0");
		    }
		    else{
		        int flag = 0;
		        char []x = a.toCharArray();
		        char []y = b.toCharArray();
		        Arrays.sort(y);
		        Arrays.sort(x);
		        for(int i=0;i<x.length;i++){
		            if(x[i]!=y[i]){
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0){
		            System.out.println("1");
		        }
		        else{
		            System.out.println("0");
		        }
		    }
		}
	}
}
