package array_test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  leng = 0;
		leng = scan.nextInt();
		String[] inputValue = new String[leng];
		char temp;
		int[] sum = new int[leng];
		
		for(int i=0; i<leng; i++) {
			inputValue[i]=scan.next();
		}
		
		for(int i=0; i<inputValue.length; i++) {
			int count = 0;
			for(int j=0; j<inputValue[i].length(); j++) {
				temp = inputValue[i].charAt(j);
				if(Character.toUpperCase(temp)== 'O') {
					count++;
					sum[i] += count;
				}else if(temp == 'X'){
					count = 0;
				}
			}
			System.out.println(sum[i]);
		}
	}
}
