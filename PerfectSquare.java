import java.util.Scanner;
class PerfectSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(isPerfectSquare(num)){
			System.out.print(num +" is a Perfect Square");
		}else{
			System.out.print(num +" is not a Perfect Square");
		}
	}
	public static boolean isPerfectSquare(int num){
		if(num<0){
			return false;
		}
		int sqrt = (int) Math.sqrt(num);
		return(sqrt * sqrt == num);
	}
}