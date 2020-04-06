package while_test;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int count = 0;
//		while (true) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			count++;
//			System.out.println(A + B);
//			if (count == 5)
//				break;
//		}

		System.out.println(fact(1));
	}

	public static int fact(int n) {

		if (n <= 1)
			return n;
		else
			return fact(n - 1) * n;
	}
}
