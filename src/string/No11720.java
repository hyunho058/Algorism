package string;

import java.util.Scanner;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 
 * 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */

public class No11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		int count =  scan.nextInt();
		scan.nextLine();
		String numList = scan.nextLine();

		for(int i = 0; i<count; i++) {
			sum += Integer.parseInt(numList.charAt(i)+"");
		}
		System.out.println(sum);
	}
}
