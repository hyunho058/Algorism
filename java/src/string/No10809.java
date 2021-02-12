package string;

import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] positionList = new int[26];
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String s = scan.nextLine();
		
		for(int i = 0; i<alpha.length(); i++) {
			for(int j = 0; j<s.length(); j++) {
				if(alpha.charAt(i)==(s.charAt(j))) {
					positionList[i] = count;
					break;
				}else {
					positionList[i]=-1;
				}
				count++;
			}
			System.out.print(positionList[i]);
			count=0;
		}
		scan.close();
	}
}
