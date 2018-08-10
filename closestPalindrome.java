/**
Given a number N. our task is to find the closest Palindrome number whose absolute difference with given number is minimum.

Input:
The first line of the input contains integer T denoting the number of test cases. Each test case contains a  number N.

Output:
For each test case, the print the closest palindrome number.
Note:  If the difference of two closest palindromes numbers is equal then we print smaller number as output.

Constraints:
1<=T<=1000
1<=n<=10^14

Input :
2
9
489

output:
9
484

Explanation :

Test Case 1: closest palindrome number is 9 itself .
**/


package test;


import java.util.*;
import java.lang.*;
import java.io.*;

class CFG {

    
   public static int palindrome(int num)
{
	int temp, rev=0, rem;
	temp = num;
	while(num != 0)
		{
			
		rem = num % 10;
		rev = rev *10 + rem;
		num = num / 10;
		
		}
		if(temp == rev){
			return rev;
		}
		else{
			return 0;
		}
}


    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int temp, rev=0, rev2=0, rem, i, t, num, x=0, y=0;
	t = sc.nextInt();
	while(t-->0)
	{
		num = sc.nextInt();
		temp = num;
		for(i=num;i>1;i--)
		{		
			rev = palindrome(i);
			if(rev !=0)
			{
                            break;
			}
		
		}
		for(i=num;i<1000000;i++)
		{		
			rev2 = palindrome(i);
			if(rev2 !=0)
			{
                            break;
			}
		
		}
		x = num - rev;
                y = rev2 - num;
                if(x < y)
                {
                    System.out.println("x"+rev);
                }
                else if(y < x)
                {
                    System.out.println("y"+rev2);
                }
                else if(x ==  y)
                {
                    System.out.println(rev);
                }
	}
	
	}
}
