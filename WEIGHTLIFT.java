//START151
import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int a1=sc.nextInt();
	 int a2=sc.nextInt();
	 int b1=sc.nextInt();
	 int b2=sc.nextInt();
	 int c1=sc.nextInt();
	 int c2=sc.nextInt();
	 int sum=0;
	 if(a1>a2)
	   sum+=a1;
	  else
	   sum+=a2;
	  if(b1>b2)
	   sum+=b1;
	  else
	    sum+=b2;
	  if(c1>c2)
	    sum+=c1;
	  else
	   sum+=c2;
     System.out.println(sum);
	 	}
}
