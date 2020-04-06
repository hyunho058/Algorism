package array_test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numList = new int[n];
		double M = 0;
		double value = 0.0;
		
		for(int i=0; i<numList.length; i++) {
			numList[i] = scan.nextInt();
			if(i == 0) {
				M = numList[i];
			}else if(M < numList[i]) {
				M = numList[i];
			}
		}
		for(int i=0; i<numList.length; i++){
			value += numList[i]/M*100;
		}
		System.out.printf("%.2f", value/n);
	}
}
