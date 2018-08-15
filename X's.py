'''
Given an integer X within the range of 0 to 9, and given two positive integers as upper and lower bounds respectively, find the number of times X occurs as a digit in an integer within the range, excluding the bounds. Print the frequency of occurrence as output.

Input:
The first line of input is an integer T, denoting the number of test cases. For each test case, there are two lines of input, first consisting of the integer X, whose occurrence has to be counted. Second, the lower and upper bound, L and U which are positive integers, on the same line separated by a single space, respectively.

Output:
For each test case, there is only one line of output, the count of the occurrence of X as a digit in the numbers lying between the lower and upper bound, excluding them.

Constraints:
1<=T<=100
0<=X<=9
0<L<U<=10^5

Example:
Input
5
3
100 250
2
10000 12345
0
20 21
9
899 1000
1
1100 1345
Output:
35
1120
0
120
398

Explanation:

In the first test case, the occurrence of 3 in the numbers starting from 101 to 249 is counted and comes out to be 35.

Similarly, for all the other test cases, the occurrence of the given number X is printed as output.
'''

t = int(input())
for i in range(t):
    n = int(input())
    count = 0
    rem = 0
    lowerBond,  upperBond = map(int, input().split())
    for j in range(lowerBond+1, upperBond):
        while j != 0:
            rem = j % 10
            
            if(rem == n):
                count +=1
            j = j // 10
            
    print(count)
        
