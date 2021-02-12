package probability;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class No2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		LinkedList<Integer> tempList = new LinkedList<Integer>();

		for (int i = M; i > 0; i--) {
			String N = Integer.toString(i);
			int numSum = i;

			for (int j = 0; j < N.length(); j++) {
				numSum += (N.charAt(j)) - '0';
//				System.out.println((N.charAt(j)- '0'));
			}
			if (M == numSum) {
				tempList.addLast(i);
				System.out.println("numSum=" + numSum + " i= " + i);
			}
		}
		if(tempList.removeLast() != null) {
			int temp = tempList.removeLast();
			System.out.println(temp);
		}else {
			System.out.println(0);
		}
	}
}
