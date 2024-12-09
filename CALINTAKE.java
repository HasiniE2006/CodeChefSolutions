//START162
import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int w=y*z;
		if(x<100 && y<100 && z<100)
		{
		if(w<x)
		System.out.println(x-w);
		else
		System.out.println("-1");
		}
		else
		System.out.println("0");

	}
}
