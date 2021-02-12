package probability;

import java.util.Scanner;

public class No2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //filed card
		int maxCardNum = scan.nextInt(); //Max cardNum
		int [] cardList = new int[n];
		int sumCard = 0;
		
		for(int i=0; i<n; i++) {
			int m = scan.nextInt(); //max card sum
			cardList[i]=m;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int t=j+1; t<n; t++) {
					int sum = cardList[i] + cardList[j] + cardList[t];
					if(sum <= maxCardNum && sumCard < sum) {
						sumCard = sum;
					}
				}
			}
//			System.out.println(cardList[i]);
		}
		System.out.println(sumCard);
	}
}
