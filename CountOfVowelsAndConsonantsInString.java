import java.util.Scanner;
class CountOfVowelsAndConsonantsInString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String input = sc.nextLine().toLowerCase();
		int vowels = 0 , consonants = 0;
		
		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(ch>='a' && ch <='z'){
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
					vowels++;
				}else{
					consonants++;
				}
			}
		} 
		System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
	}
}