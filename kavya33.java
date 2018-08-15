/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;++i)
          {
           System.out.println(a + "+");
           int sum=a+b;
           a=b;
           b=sum;
           System.out.println("fibonacci series is");
          }
   }
}
