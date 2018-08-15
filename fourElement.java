/**
Given an array of integers, find a combination of four elements in the array whose sum is equal to a given value X.

Input:
First line consists of T test cases. First line of every test case consists of an integer N, denoting the number of elements in an array. Second line consists of N spaced array elements. Third line of every test case X.

Output:
Single line output, print 1 if combination is found else 0.

Constraints:
1<=T<=100
1<=N<=100

Example:
Input:
1
6
1 5 1 0 6 0
7
Output:
1
**/

import java.util.*;

class test2 {
	public static void main (String[] args) {
             Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n = sc.nextInt();
		    int [] arr = new int[n];
		    for(int l=0; l<arr.length; l++)
                    {
                        arr[l] = sc.nextInt();
                    }
                    int x =sc.nextInt();
                    int count=0;
                     for(int j=0; j<arr.length-3; j++)
		        {
		        for(int k=j+1; k<arr.length-2; k++)
		        {
		             for(int l=k+1;l<arr.length-1; l++)
                    {
		             for(int m=l+1; m<arr.length; m++)
                    {
                        if(arr[j]+arr[k]+arr[l]+arr[m]==x)
                        {
                            count=1;
                            break;
                            }
                        }
                    }
                }
		    }
		    System.out.println(count);
		
	}
}
}
