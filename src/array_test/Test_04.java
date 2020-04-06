package array_test;

import java.util.Scanner;

public class Test_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int[] countList = new int[10];
		String value = Integer.toString(A*B*C);
		
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i) == '0') {
				countList[0]++;
			}
			else if(value.charAt(i) == '1') {
				countList[1]++;
			}
			else if(value.charAt(i) == '2') {
				countList[2]++;
			}
			else if(value.charAt(i) == '3') {
				countList[3]++;
			}
			else if(value.charAt(i) == '4') {
				countList[4]++;
			}
			else if(value.charAt(i) == '5') {
				countList[5]++;
			}
			else if(value.charAt(i) == '6') {
				countList[6]++;
			}
			else if(value.charAt(i) == '7') {
				countList[7]++;
			}
			else if(value.charAt(i) == '8') {
				countList[8]++;
			}
			else if(value.charAt(i) == '9') {
				countList[9]++;
			}
		}
		
		for(int i=0;i<countList.length;i++) {
			for(int j=0; j<countList.length;j++) {
				
			}
		}
	}
}
