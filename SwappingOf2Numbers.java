import java.util.Scanner;
class SwappingOf2Numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the value of a : ");
		int a=sc.nextInt();
		System.out.println("\nEnter the value of b : ");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The Values of a and b after swapping~~~~~~~~~~ ");
		System.out.println("The value of a is :\n" +a);
		System.out.println("The value of b is :\n" +b);
	}
}