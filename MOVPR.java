//START160
import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    if(x+y<z)
    {
    int a=y*3;
    System.out.println((2*x)+a);
    }
    else
    System.out.println((z*2)+70);
	}
}
