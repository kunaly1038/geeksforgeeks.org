/**Given a String S and an integer number N, print the output in the form : "The input string :S" and "The input integer :N" in new lines.

INPUT: The first line consists of an integer T i.e. the number of test cases. First line of each test case consists of an String S .Last line consists of an integer N.

OUTPUT: Print the required output.

CONSTRAINTS:

1<=T<=100
1<=|String Length|<=103
1<=N<=104

EXAMPLES:
INPUT :
1
GeeksforGeeks
20

OUTPUT : 
The input string :GeeksforGeeks
The input integer :20**/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    while(t-- >0){
	        	String s = sc.next();
		    int x = sc.nextInt();
		    System.out.println("The input string :"+s);
		    System.out.println("The input integer :"+x);
	    }
	}
}
