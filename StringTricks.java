import java.util.Scanner;

public class StringTricks {

	public static void main(String[] args) {

		System.out.println(isPalindrome());
	}
	
	
	//this method returns whether a string has all unique characters
	public static boolean uniqueChars(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++){
				for (int j = i+1; j < s.length(); j++){
					if (s.charAt(i) == s.charAt(j)){
						return false;
					}
				}
			}
		return true;
		}
	
	//this method alternates between upper and lower case depending on whether the position of the letter is odd or even
	public static String alternatingCase(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String newString = "";
		for (int i = 0; i < s.length(); i++){
			if ((i + 1) % 2 == 0){
				char letter = s.charAt(i);
				String newLetter = (Character.toString(letter)).toUpperCase();
				newString += newLetter;
			}
			else {
				char letter = s.charAt(i);
				String newLetter = (Character.toString(letter)).toLowerCase();
				newString += newLetter;
			}
		}
		return newString;
	}
	
	//this method reverses a string
	public static String reverseString(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String reverseWord = "";
		for (int i = 1; i <= s.length(); i++){
			String newLetter = Character.toString(s.charAt(s.length()-i));
			reverseWord += newLetter;
		}
		return reverseWord;
		}
	
	//this method removes the middle letter of a string (or middle two letters, if the length of the word is even)
	public static String middleRemove(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String firstHalf = "";
		String lastHalf = "";
		if (s.length()%2==0){
			firstHalf = s.substring(0, (s.length()/2-1));
			lastHalf = s.substring((s.length()/2+1));
		}
		else {
			firstHalf = s.substring(0, (s.length()/2));
			lastHalf = s.substring((s.length()/2+1));
		}
			return firstHalf+lastHalf;
	}
		
	//this method determines whether a string is a palindrome
	public static boolean isPalindrome(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String reverseWord = "";
		for (int i = 1; i <= s.length(); i++){
			String newLetter = Character.toString(s.charAt(s.length()-i));
			reverseWord += newLetter;
		}
		return (s.equals(reverseWord));
	}
	
	//this method counts the number of vowels in a string
	public static int numberOfVowels(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int counter = 0;
		for (int i = 0; i < s.length(); i++){
			String letter = Character.toString(s.charAt(i));
			if ((letter.equals("a")) || (letter.equals("e")) || (letter.equals("i")) || (letter.equals("o")) || (letter.equals("u"))){
				counter++;
				}
		}
		return counter;	
	}
	}

	
	


	

			
				
