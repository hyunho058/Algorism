package string;

import java.util.Scanner;

public class No1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int seq = scan.nextInt();
		scan.nextLine();
		int count = seq;
		String word ="";
		
		for(int i=0; i<seq; i++) {
			System.out.println("i="+i);
			word = scan.nextLine().trim();
			for(int j=0; j<word.length(); j++){
				for(int i1=0; i1<word.length(); i1++) {
					System.out.println("j="+j+word.charAt(j)+" /i1="+i1+word.charAt(i1));
					if(i1-j >1 && word.charAt(i1)==word.charAt(j)) {
						System.out.println("break,,,,,"+word);
						count--;
						j = word.length();
						break;
					}else if(i1-j ==1 && word.charAt(i1)==word.charAt(j)) {
						j++;
					}
				}
				System.out.println("count="+count);
			}
		}
		System.out.println(count);
		scan.close();
	}
}
