/**
Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”.


INPUT: The first line consists of an integer T i.e. the number of test cases. First line of each test case consists of an integer n, denoting the size of array. Next line consists of n spaced integers, denoting elements of array.


OUTPUT:  Print “Yes” if it is a set of contiguous integers else print “No”.

 

CONSTRAINTS:
1<=T<=100
1<=n<100000
a[i]<=105

 Example:

 2
8
5  2  3  6  4  4  6  6
7
10  14  10  12  12  13  15

Output :
 Yes
 No

Explanation:
Test Case 1 : The elements  of array form a contiguous set of integers which is {2, 3, 4, 5, 6} so the output is Yes.
Test Case 2: We are unable to form contiguous set of integers using elements of array.
**/



import java.util.*;
import java.lang.*;
import java.io.*;

class CFG {
    public static boolean contiguousInteger(int [] arr, int size)
    {
        Arrays.sort(arr);
        for(int  i= 1 ;i < size; i++)
        {
            if(arr[i]-arr[i-1]>1)
                return false;
        }
        return true;
    } 
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-->0)
        {
            int size = sc.nextInt();
            int [] arr =new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            if(contiguousInteger(arr,size)==true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
