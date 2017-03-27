
public class EulerProblem2 {

	public static void main(String[] args) {
		
		int firstInput = 1;
		int secondInput = 2;
		int accumulator = 2;
		int count = 0;
		
		while ((firstInput < 4000000) && (secondInput < 4000000)){
			if (count % 2 == 0) {
				firstInput = firstInput + secondInput;
				if (firstInput % 2 == 0) {
					accumulator = accumulator + firstInput;}
				count++;
			}
			else {
				secondInput = firstInput + secondInput;
				if (secondInput % 2 == 0) {
					accumulator = accumulator + secondInput;}
				count++;
			
		}
		}
		System.out.println(accumulator);
	}

}

