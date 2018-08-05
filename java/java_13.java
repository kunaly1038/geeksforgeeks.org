/**
Java Calendar class is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.

Given a date(dd mm yyyy) in form of string. Print the day at the given date.

For example, if the given date is MARCH 17th 2017 print the output as FRIDAY.

Image result for calendar 2017 march

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first and the only line of each test case contains a string S(date). 

Output: Corresponding to each test case, print the required output.

Constraints:

1<=T<=100
2000<year<3000


Example:

Input:
2
17 03 2017
29 11 2021

Output:
FRIDAY
MONDAY
 **/
 
 /*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String date = sc.next();
		    String month = sc.next();
		    String year = sc.next();
		    
		    int cdate = Integer.parseInt(date);
		    int cmonth = Integer.parseInt(month);
		    int cyear = Integer.parseInt(year);
		    
		    Calendar calendar = Calendar.getInstance();
		    calendar.set(cyear,cmonth-1,cdate);
		    System.out.println(new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());

		}
	}
}
