package reculsion;

import java.util.Scanner;

public class No10870 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(function(1, 1, number));
	}

	private static int function(int num1, int num2, int number) {
		if(number == 0) {
			return 0;
		}
		else if(number == 1) {
			return num1; 
		}
		else {
			int sum= num1+ num2;
			number-= 1;
			return function(num2, sum, number);
		}
	}
}
