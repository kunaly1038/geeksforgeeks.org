/**
Today your task is simple. You have to calculate area of circle and rectangle depending upon user's choice.

Input:
First line of the input contains an integer T which denotes the number of test cases. Then T test cases follow.  Each test case contains two lines. First line contain 1 for circle or  2 for rectangle.Second line contains integers R(radius) or L(length) and B(Breadth)(space separated).

Output: 
For each test case, print area of circle or rectangle.

Constraints:
1 <= T< = 10
1<=R<=100
1<=L<= 100
1<=B<= 100

Note: Use Math.PI for pi value.
Example:
Input:
2
1
5
2
5 10    

Output:
78.53981633974483
50
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
		    switch(x){
		        case 1:
		            int r = sc.nextInt();
		            double circle =Math.PI*r*r;
		            System.out.println(circle);
		            break;
		        case 2:
		            int l = sc.nextInt();
		            int b = sc.nextInt();
		            int rectangle = l*b;
		            System.out.println(rectangle);
		            break;
		    }
		}
	}
}
