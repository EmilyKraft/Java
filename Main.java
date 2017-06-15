import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println("Please enter a double: ");
		
		double radius = sc.nextDouble();
		
		System.out.println("Circle Area: " + MathEquations.circleArea(radius));
		System.out.println("Circle Circumference: " + MathEquations.circleCircum(radius));

		
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		
		System.out.println("Triangle Area: " + MathEquations.triangeArea(base, height));
		
		int num = sc.nextInt();
	
		System.out.println("Is " + num + " even? " + MathEquations.isEven(num));
		
		System.out.println("The new format for this number is: " + reformatNum(num));
		
		String letter = sc.nextLine();
		System.out.println("The value of " + letter + " is: " + letterNumValue(letter));
	
		
		double num = sc.nextDouble();
		System.out.println("You entered " + num + ", the new value is " + MathEquations.roundDouble(num) + ".");
		*/
		
		System.out.println(leapYear());
	}

	public static double reformatNum(int number){
		return (double)number;
	}
	
	public static int letterNumValue(String a){
		char c = a.charAt(0);
		return Character.getNumericValue(c);
	}
	
	public static String leapYear(){
		String leapYear = "This is a leap year.";
		String nonLeap = "This is not a leap year.";
		System.out.println("Please enter a four digit year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			return leapYear;
		}
		
		else {
			return nonLeap;
		}
		
	}
	
	
	
	
	
}
