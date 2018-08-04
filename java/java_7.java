/**
Given three numbers A,B and C. Find roots of quadratic equation Ax2 + Bx + C = 0. (A not equal to  0)

Input:
First line of the input contains an integer T which denotes the number of test cases. Then T test cases follow.  Each test case contains a single line containing three space separated integers A,B and C. 

Output: 
For each test case, Print two roots of quadratic equation(space separated) in ascending order. For complex roots,print COMPLEX.

Constraints:
1 <= T< = 100
-10<=A<=10
-10<=B<= 10
-10<=C<= 10

Note: A is not equal to 0.

Example:
Input:
3
2 3 4
3 5 1
1 -4 4    
Output:
COMPLEX
-1.4342586 -0.23240812 
2.0 2.0
**/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int root = (b*b)-(4*a*c);
            if(root>0 && a!=0){
                double x = (-b+Math.sqrt(root))/(2*a);
                double y = (-b-Math.sqrt(root))/(2*a);
                if(x>y){
                    System.out.println((float)y+" "+(float)x);
                }
                else if(y>x){
                    System.out.println((float)x+" "+(float)y);
                }
            }
            else{
                System.out.println("COMPLEX");
            }
        }
	}
}
