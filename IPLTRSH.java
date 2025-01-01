//START85
import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 while(n!=0)
	 {
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     if(a>b)
	     System.out.println(a-b);
	     else
	     System.out.println("0");
	     n--;
	 }

	}
}
