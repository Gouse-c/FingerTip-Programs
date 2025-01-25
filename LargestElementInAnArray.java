import java.util.Scanner;
class LargestElementInAnArray{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array elements:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		System.out.println("The maximum element in the array is : ");
		for(int i=0;i<=a.length-1;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}
}