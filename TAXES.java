//START60
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0)
    {
        int a=sc.nextInt();
        if(a>100)
        System.out.println(a-10);
        else
        System.out.println(a);
        n--;
    }

	}
}
