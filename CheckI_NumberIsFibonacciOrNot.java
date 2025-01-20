import java.util.Scanner;
class CheckI_NumberIsFibonacciOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isFibonacci(num)){
			System.out.print(num +" is a Fibonacci Number ");
		}else{
			System.out.print(num +" is not a Fibonacci Number");
		}
	}
	public static boolean isPerfectSquare(int x){
		int sqrt = (int) Math.sqrt(x);
		return (sqrt*sqrt==x);
	}
	public static boolean isFibonacci(int num){
		return isPerfectSquare(5* num * num+4)|| isPerfectSquare(5* num * num-4);
	}
}