package reculsion;

import java.util.Scanner;

public class No10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = 1;
		if (number >= 0 && number <= 12) {
			for (int i = 1; i <= number; i++) {
				result *= i;
			}
			System.out.println(result);
		}
		System.out.println(function(10));
		
	}
	static int function(int number) {
		int data = number;
		int count = 0;
		int result = 1;
		if(number == 0) {
			return 0;
		}else {
			System.out.println("??");
			return function(number-1);
		}
	}
}
