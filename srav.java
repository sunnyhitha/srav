/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class LargestOfThreeNumbers
{
   public static void main(String args[])throws IOException
   {
      int a, b, c;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
 
      if ( a > b && a > c )
         System.out.println(a);
      else if ( b > a && b > c )
         System.out.println(b);
      else if ( c > a && c > b )
         System.out.println(c);
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}
