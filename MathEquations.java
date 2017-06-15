
public class MathEquations {

	public static double circleArea(double radius){
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public static double circleCircum(double radius){
		return (Math.PI * (2 * radius));
	}
	
	public static double triangeArea(double base, double height){
		return ((base*height)/2);
	}
	
	public static boolean isEven(int num){
		if (num % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int roundDouble(double num){
		return (int) Math.round(num);
	}
	
	public static int sumMethod(int start, int end){
		int accumulator = 0;
		for (int i = start; i <= end; i++){
			accumulator+=i;
		}
		return accumulator;
	}
}
