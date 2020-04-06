package string;

import java.util.Scanner;

public class No1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine().trim();
		String[] msgWord = msg.split(" ");
		
		if(msg.isEmpty()) {
			System.out.println("0");
		}else {
			System.out.println(msgWord.length);
		}
		scan.close();
	}
}
