package array_test;

import java.util.Scanner;

public class SortComparison {

	public static void main(String[] args) {
		int[] inArray = new int[8];
		String ascending = "cdefgabC";
		String descending = "Cbagfedc";
		String temp = "";
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<inArray.length; i++) {
			inArray[i] = scan.nextInt();
		}
		
		for(int i=0; i<inArray.length; i++) {
			if(inArray[i] == 1) {
				temp += 'c';
			}
			else if(inArray[i] == 2) {
				temp += 'd';
			}
			else if(inArray[i] == 3) {
				temp += 'e';
			}
			else if(inArray[i] == 4) {
				temp += 'f';
			}
			else if(inArray[i] == 5) {
				temp += 'g';
			}
			else if(inArray[i] == 6) {
				temp += 'a';
			}
			else if(inArray[i] == 7) {
				temp += 'b';
			}
			else if(inArray[i] == 8) {
				temp += 'C';
			}
		}
		if (temp.equals(ascending))
			System.out.println("ascending");
		else if (temp.equals(descending))
			System.out.println("descending");
		else 
			System.out.println("mixed");
	}
}
