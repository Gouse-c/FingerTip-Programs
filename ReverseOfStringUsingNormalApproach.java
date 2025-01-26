import java.util.Scanner;
class ReverseOfStringUsingNormalApproach{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		String reversed=reversedString(str);
		System.out.println(reversed);
	}
	public static String reversedString(String str){
		char a[]=str.toCharArray();
		String reversed="";
		for(int i=a.length-1;i>=0;i--){
			reversed=reversed+a[i];
		}
		return reversed;
	}
}