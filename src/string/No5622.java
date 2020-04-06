package string;

import java.util.Scanner;

public class No5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String wordList = scan.nextLine().trim().toUpperCase();
		System.out.println(wordList);
		int sec = 0;
		
		
		for(int i = 0; i<wordList.length(); i++) {
			char alpha = wordList.charAt(i);
			if((int)alpha>= 65 && (int)alpha <= 67) {
				sec += 3;
			}else if((int)alpha>= 68 && (int)alpha <= 70){
				sec += 4;
			}else if((int)alpha>= 71 && (int)alpha <= 73){
				sec += 5;
			}else if((int)alpha>= 74 && (int)alpha <= 76){
				sec += 6;
			}else if((int)alpha>= 77 && (int)alpha <= 79){
				sec += 7;
			}else if((int)alpha>= 80 && (int)alpha <= 83){
				sec += 8;
			}else if((int)alpha>= 84 && (int)alpha <= 86){
				sec += 9;
			}else if((int)alpha>= 87 && (int)alpha <= 90){
				sec += 3;
			}else{
				sec += 2;
			}
		}
		System.out.println(sec);
		scan.close();
	}
}
