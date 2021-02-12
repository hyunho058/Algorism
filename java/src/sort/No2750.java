package sort;

import java.util.Scanner;

public class No2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] number = new int[N];
		int swap = 0;
		
		for(int i=0; i<N; i++) {
			number[i]=scan.nextInt();
		}
		
		for(int i=0; i<number.length; i++) {
			
			for(int j=i+1; j<number.length; j++) {
				if(number[i] > number[j]) {
					swap = number[i];
					number[i] = number[j];
					number[j] = swap;
				}
			}
			System.out.println(number[i]);
		}
		scan.close();
	}
}
