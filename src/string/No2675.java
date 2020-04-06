package string;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] P = new String[count];
		for(int i=0; i<count; i++) {
			int R = scan.nextInt();
			String S = scan.nextLine();
			for(int j=0; j<S.length(); j++) {
				for(int rc=0; rc<R; rc++) {
					P[i] += S.charAt(j);					
				}
			}
			System.out.println(P);
		}
 	}
}
