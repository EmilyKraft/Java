import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
		int loopOne = 0;
		for (int i = 1; i <= 10; i++){
			loopOne+=i;
		}
		
		int loopTwo = 0;
		for (int i = 20; i <= 30; i++){
			loopTwo+=i;
		}
		
		int loopThree = 0;
		for (int i = 35; i <= 45; i++){
			loopThree+=i;
		}
		
		//System.out.println(loopOne + " " + loopTwo + " " + loopThree);
		//System.out.println(sumLimit(2,3));
		//System.out.println(sumMethod(1,10));
		//System.out.println(squirrelPlay2(false,70)); //true
		//System.out.println(squirrelPlay2(false,95)); //false
		//System.out.println(squirrelPlay2(true,95)); //true
		//System.out.println(playLottery(1,2,3));
		//System.out.println(playLottery(2,2,2));
		//System.out.println(playLottery(2,2,3));
		//System.out.println(countXX("abcxx"));
		//System.out.println(countXX("xxx"));
		//System.out.println(countXX("xxxx"));
		//System.out.println(stringTimes("Hi", 2));
		//System.out.println(stringTimes("Hi", 3));
		//System.out.println(stringTimes("Hi", 1));
		
	
	}

	//returns sum if the number of digits in the sum match the number of digits in first number, otherwise returns first number only
	public static int sumLimit(int numOne, int numTwo){
		int sum = numOne + numTwo;
		if (String.valueOf(numOne).length() == String.valueOf(sum).length()){
			return sum;
		}
		else {
			return numOne;
		}

	}
	
	//decides whether squirrels play outside based on time of year and temperature
	public static boolean squirrelPlay(boolean isSummer, int temp){
		if (isSummer){
			if ((temp >= 60) && (temp <= 100)){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if ((temp >= 60) && (temp <= 90)){
				return true;
			} 
			else {
				return false;
			}
		}
	}
	
	//alternative approach to previous squirrel question
	public static boolean squirrelPlay2(boolean isSummer, int temp){
		if (isSummer && (temp >= 60) && (temp <= 100)){
			return true;
			}
		else if ((temp >= 60) && (temp <= 90)){
			return true;
			}
		else {
			return false;
			}
		}
	
	//returns 20 if all three match, 10 if two match, and 0 if all are different
	public static int playLottery(int numOne, int numTwo, int numThree){
		if ((numOne == numTwo) && (numTwo == numThree)){
			return 20;
		}
		else if ((numOne == numTwo) || (numTwo == numThree) || (numOne == numThree)){
			return 10;
		}
		else {
			return 0;
		}
	}
	
	//counts the number of "xx" in the string... overlapping counts
	public static int countXX(String str){
		int accumulator = 0;
		for (int i = 0; i < str.length()-1; i++){
			if (str.substring(i, i+2).equals("xx")){
				accumulator++;
			}
		}
		return accumulator;
	}
	
	//multiplying a string by a given integer
	public static String stringTimes(String str, int times){
		String newString = "";
		for (int i = 1; i <= times; i++){
			newString += str;
		}
		return newString;
	}
}


