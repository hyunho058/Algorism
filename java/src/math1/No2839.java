package math1;

import java.util.Scanner;

public class No2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int item1 = 3;
		int item2 = 5;
		int roadWeigth = scan.nextInt();
		int result = 0 ;
		
		result = roadWeigth/item2;
		System.out.println(result);
		System.out.println(roadWeigth%item2);
		if(roadWeigth%item2 != 0) {
			for(int i=0;result>=0;result--) {
				
			}
		}
		
	}

}
