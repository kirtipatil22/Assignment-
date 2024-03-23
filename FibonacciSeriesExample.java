import java.util.Scanner;
class FibonacciSeriesExample
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number=");
		int count=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);

		for(int i=2;i<count;i++)
		{
			int temp=n1;
			n1 = n2;
			n2=temp + n2;
			System.out.println(n2);

		}
		
	}
}
	//1,1,2,3,5,8,13,21,34,