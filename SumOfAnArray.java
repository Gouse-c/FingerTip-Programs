import java.util.Scanner;
class SumOfAnArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int n = sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("The sum of an array is : ");
		for(int i=0;i<=a.length-1;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}