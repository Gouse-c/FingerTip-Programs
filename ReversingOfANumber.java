import java.util.Scanner;
class ReversingOfANumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		/*String str = Integer.toString(num);
		
		str = new StringBuffer(str).reverse().toString();
		System.out.println(str);*/
		
		
		
		int rev = reverseNum(num);
		System.out.println(rev);
	}
	public static int reverseNum(int num){
		
		int rev = 0;
		
		while(num != 0){
			
			int rem = num % 10;
			
			rev = (rev * 10) + rem;
			
			num /= 10;
		}
		return rev;
	}
}