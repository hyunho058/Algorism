package array_test;

import java.util.Scanner;

public class test102 {

	public static void main(String[] args) {
		int[] numList = new int[9];
		Scanner scan = new Scanner(System.in);
		int maxNum = numList[0];
		int count = 0;

		for (int i = 0; i < numList.length; i++) {

			numList[i] = scan.nextInt();
			if (numList[i] < 100) {
				if (i == 0) {
					maxNum = numList[0];
				} else if (i != 0 && maxNum < numList[i]) {
					maxNum = numList[i];
				}
			}
			else {
				i--;
			}
		}
		for (int i = 0; i < numList.length; i++) {
			count++;
			if (numList[i] == maxNum) {
				break;
			}
		}
		System.out.printf("%d %n%d", maxNum, count);
	}
}
