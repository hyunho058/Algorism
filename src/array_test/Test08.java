package array_test;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i1 = scan.nextInt();
		int i2 = 0;
		int sum = 0;
		double avg = 0;
		int[][] numList = new int [i1][];
		
		for(int i = 0; i<i1; i++) {
			i2 = scan.nextInt();
			numList[i] = new int[i2];
			for(int j = 0; j<i2; j++) {
				numList[i][j] = scan.nextInt(); 
			}
		}
		
		for(int i = 0; i<i1; i++) {
			for(int j = 0; j<numList[i].length; j++) {
				sum += numList[i][j];
			}
//			avg = sum/numList[i];
//			System.out.printf("%.3f%% \n",avg);
		}
	}
}
