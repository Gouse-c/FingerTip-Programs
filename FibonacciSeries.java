import java.util.Scanner;
class FibonacciSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		System.out.println("Enter the end point:");
		int end=sc.nextInt();
		for(int i=1;i<=end;i++){
			System.out.print(num1+" ");
			int next = num1 + num2;
			num1=num2;
			num2=next;
		}
	}
}