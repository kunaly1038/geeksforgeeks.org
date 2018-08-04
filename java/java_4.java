/**
Given three values of different data types. You are required to store these values in variables of corresponding data type and output them.

Input:
The first line of input contains integer T denoting the number of test cases. For each test case, given three values (integer,String,float) space separated.

Output: 
For each test case, print all the input values space separated in the same order as the input. 

Constraints:
1<=T<=100

Example:
Input:
2
1 gfg 2.4
18 geeksforgeeks 9.88

Output:
1 gfg 2.4
18 geeksforgeeks 9.88
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
		    String s = sc.next();
		    float f = sc.nextFloat();
		    System.out.println(x+" "+s+" "+f);
		}
	}
}
