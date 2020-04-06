package string;

import java.util.Scanner;

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
