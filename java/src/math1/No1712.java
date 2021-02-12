package math1;

import java.util.Scanner;

public class No1712 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fixCoast = scan.nextInt();
		int variableCoast = scan.nextInt();
		int productPrice = scan.nextInt();
		
		if(variableCoast>=productPrice) {
			int result = -1;
			System.out.println(result);
		}else {
			int result = fixCoast/(productPrice-variableCoast)+1;
			System.out.println(result);
		}
	}
}
