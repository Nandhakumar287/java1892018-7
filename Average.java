import java.io.*;
import java.util.*;
import java.lang.*;
  public class Average{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Range:");
       int range=sc.nextInt();
       int a[]=new int[range];
       int temp=0;
       for(int i=0;i<range;i++)
       {
        a[i]=sc.nextInt();
       }
       for(int j=0;j<range;j++)
       {
       temp=temp+a[j];
       }
	    System.out.println("Average:"+(int)Math.ceil(temp/range));
      }
    } 
       
