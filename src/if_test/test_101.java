package if_test;

import java.util.Scanner;

public class test_101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int A,B;
		

		for (int i = 0; i < count; i++) {
			A = scan.nextInt();
			B = scan.nextInt();

			if (A > 0 && B < 10) {
				System.out.printf("Case #%d: %d + %d = %d %n", i + 1,A,B, (A + B));
			}

		}
	}
}
