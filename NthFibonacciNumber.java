import java.util.Scanner;
class NthFibonacciNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nth number u need to find:");
		int n=sc.nextInt();
		System.out.print("The nth Fibonacci Number is :" + nthFibonacci(n));
	}
	public static int nthFibonacci(int n){
		if(n==1 || n==2){
			return 1;
		}
		int num1=1,num2=1;
		for(int i=3;i<=n;i++){
			int next=num1+num2;
			num1=num2;
			num2=next;
		}
		return num2;
	}
}