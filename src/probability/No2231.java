package probability;

import java.util.Scanner;

public class No2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		
		for(int i=M-1; i>100; i--) {
			String N = Integer.toString(i);
			int numSum = i;
			
			for(int j=0; j<N.length(); j++) {
				numSum+=(N.charAt(j))- '0';
				System.out.println((N.charAt(j)- '0'));
				if(0==(N.charAt(j))- '0') {
					break;
				}
			}
			if(M == numSum) {
				System.out.println(numSum);
				System.out.println(N);
				break;
			}else if(i<101) {
				System.out.println(0);
			}
		}
	}

}
