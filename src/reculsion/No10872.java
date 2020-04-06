package reculsion;

import java.util.Scanner;

public class No10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		System.out.println(function(number));
	}

	static int function(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * function(number - 1);
		}
	}
}
