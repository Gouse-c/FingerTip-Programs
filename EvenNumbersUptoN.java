import java.util.Scanner;
class EvenNumbersUptoN
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the End point : ");
		int end=sc.nextInt();
		System.out.println("The Even Numbers upto N is : ");
		for(int i=1;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}