/**
Given an array of n length, and we need to calculate the next greater element for each element in given array. If next greater element is not available in given array then we need to fill ‘_’ at that index place.

Input:
The first line contains an integer T, the number of test cases. For each test case, the first line contains an integer n, the size of the array. Next line contains n space separated integers denoting the elements of the array. 

Output:
For each test case, the output is an array that displays next greater element to element at that index.

Constraints:
1<=T<=100
1<=n<=100
-10<=Ai<=10^6

Example:
Input
2
9
6 3 9 8 10 2 1 15 7
4
13 6 7 12
Output
7 6 10 9 15 3 2 _ 8
_ 7 12 13
**/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
		    int[] A = new int[n];
		    int[] B = new int[n];
		    for(int i=0;i<n;i++)
		        A[i]=sc.nextInt();
		    
		    for(int i=0;i<n;i++)
		        B[i]=A[i];
		    Arrays.sort(B);
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            if(A[i]<B[j]){
		                System.out.print(B[j]+" ");
		                break;
		            }
		            if(A[i]==B[n-1]){
		                System.out.print("_ ");
		                break;
		            }
		        }
		    }System.out.println(" ");
        }
	}
}
