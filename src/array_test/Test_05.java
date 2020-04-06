package array_test;

import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op = 45;
		int count = 0;
		int[] numIn = new int[10];
		int[] valueList = new int[10];

		for (int i = 0; i < numIn.length; i++) {
			numIn[i] = scan.nextInt();
			valueList[i] = numIn[i] % op;
		}
		for (int i = 0; i < valueList.length - 1; i++) {
			
			for(int j=1; j<valueList.length; j++)
			if (valueList[i] == valueList[j]) {
				count++;
				break;
			}
		}
		System.out.println(count);
		System.out.println(10-count);
	}

}
