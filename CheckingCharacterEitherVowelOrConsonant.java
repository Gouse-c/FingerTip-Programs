import java.util.Scanner;
class CheckingCharacterEitherVowelOrConsonant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character:");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch>='a' && ch<='z'){
			if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				System.out.print(ch + " is a Vowel.");
			}else{
				System.out.print(ch + " is a Consonant.");
			}
		}else{
			System.out.print("Invalid Input! Please enter an alphabet.");
		}
	}
}