import java.util.Scanner;
class FibonacciUsingRecursion{
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
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
}