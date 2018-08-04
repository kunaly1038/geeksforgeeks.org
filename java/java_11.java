/**.Given two strings as input. Your task is to concanate two strings and then reverse the string. Finally print the reversed string.

Input:
First line of the input file contains an integer T which denotes the number of test cases. Then T test cases follow. First line of each test case contains a string A and second line contains another string B.

Output: 
For each test case, print the reversed string.

Constraints:
1<=T<=20
1<=length(A)<=50
1<=lenght(B)<=50

Example:
Input:
2
Geeks
forGeeks
Practice
geeks
Output:
skeeGrofskeeG
skeegecitcarP
**/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            String sum  = a+b;
            String reverse  =  "";
    
            for(int i=sum.length()-1;i>=0;i--){
                reverse = reverse + sum.charAt(i);
            }
            System.out.println(reverse);
        }
	}
}
