package sort;

import java.util.Scanner;

/**
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값 
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값 
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 
 * 값 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */

public class No2108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] numList = new int[N];
		double numSum = 0;
		int swap = 0;
		int temp = 0;
		int count = 0;
		int subCount = 0;
		int numFrequency = 0;

		for (int i = 0; i < numList.length; i++) {
			numList[i] = scan.nextInt();
		}

		for (int i = 0; i < numList.length; i++) {
			for (int j = i + 1; j < numList.length; j++) {
				if (numList[i] > numList[j]) {
					swap = numList[i];
					numList[i] = numList[j];
					numList[j] = swap;
				}
			}
			numSum += numList[i];
			System.out.println(numList[i]);
		}
		System.out.println();
		for(int i=0; i<numList.length; i++) {
			int localCount = 0;
			
			for(int j=0; j<numList.length; j++) {
				if(numList[i] == numList[j]) {
					localCount++;
				}
			}
			
			if(count <= localCount && localCount > 1) {
				System.out.println(numList[i]);
				count = localCount;
				if(count == localCount && temp != numList[i]) {
					temp = numList[i];
					++subCount;
					System.out.println("subCount =="+subCount);
					if(subCount == 2) {
						numFrequency = numList[i];
					}
				}else {
					numFrequency = numList[i];
				}
			}else if (numList.length == 1) {
				numFrequency = numList[0];
			}else {
				numFrequency = numList[1];
			}
		}
		scan.close();
		System.out.println();
		System.out.println(Math.round(numSum/N));
		System.out.println(numList[(N/2)]);
		System.out.println(numFrequency);
		System.out.println(numList[N-1]-numList[0]);
	}
}
