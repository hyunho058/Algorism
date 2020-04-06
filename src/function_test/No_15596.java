package function_test;

import java.util.Scanner;

public class No_15596 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numList = new int[n];
		for (int i = 0; i < n; i++) {
			numList[i] = scan.nextInt();
		}
		System.out.println(sum(numList));
	}

	static long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}

}
