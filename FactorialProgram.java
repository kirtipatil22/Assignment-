import java.util.Scanner;
public class FactorialProgram
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number=");
		int n = sc.nextInt();
		int fact=1;
		for(int i=1; i<=n;i++)
		{
			fact=fact * i;
			
		}
		System.out.println(fact);
	}
}

//5!=5*4*3*2*1