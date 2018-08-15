/**
Rahul and Ankit are the only two waiters in Royal Restaurant. Today, the restaurant received N orders. The amount of tips may differ when handled by different waiters, if Rahul takes the ith order, he would be tipped Ai rupees and if Ankit takes this order, the tip would be Bi rupees.
In order to maximize the total tip value they decided to distribute the order among themselves. One order will be handled by one person only. Also, due to time constraints Rahul cannot take more than X orders and Ankit cannot take more than Y orders. It is guaranteed that X + Y is greater than or equal to N, which means that all the orders can be handled by either Rahul or Ankit. Find out the maximum possible amount of total tip money after processing all the orders.


Input:

•    The first line contains one integer, number of test cases.
•    The second line contains three integers N, X, Y.
•    The third line contains N integers. The ith integer represents Ai.
•    The fourth line contains N integers. The ith integer represents Bi.

 

Output:
Print a single integer representing the maximum tip money they would receive.
 

Constraints:
1 ≤ N ≤ 105
1 ≤ X, Y ≤ N; X + Y ≥ N
1 ≤ Ai, Bi ≤ 104
**/


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    
    public static void sort(int[] diff,int[] A,int[] B){
        for(int i=0;i<diff.length;++i){
            for(int j=i+1;j<diff.length;++j){
                if(diff[j]>diff[i]){
                    int temp=diff[j];
                    diff[j]=diff[i];
                    diff[i]=temp;
                    temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                    temp=B[j];
                    B[j]=B[i];
                    B[i]=temp;
                }
            }
        }
    }
    public static int solution(int[] A,int[] B,int N,int X,int Y){
        int[] diff=new int[N];
        int sum=0;
        for(int i=0;i<N;++i){
            diff[i]=(int)Math.abs(A[i]-B[i]);
        }
        //       System.out.println(Arrays.toString(diff));
//System.out.println(Arrays.toString(A));
//System.out.println(Arrays.toString(B));
      sort(diff,A,B);
  //      System.out.println(Arrays.toString(diff));
    //    System.out.println(Arrays.toString(A));
      // System.out.println(Arrays.toString(B));

        for(int i=0;i<A.length;++i){
            if(X==0){
                sum+=B[i];
            } else if(Y==0){
                sum+=A[i];
            } else {
                if(A[i]>B[i]){sum+=A[i];--X;}
                else {sum+=B[i];--Y;}
            }
            
        }
        return sum;
    }
    
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;++i){
		    int N=s.nextInt();
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    int[] A=new int[N];
		    int[] B=new int[N];
		    for(int j=0;j<N;++j){
		        A[j]=s.nextInt();
		    }
		    for(int j=0;j<N;++j){
		        B[j]=s.nextInt();
		    }
		    int ans=solution(A,B,N,X,Y);
		    System.out.println(ans);
		}
	}
}
