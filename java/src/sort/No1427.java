package sort;

import java.util.Scanner;

public class No1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numList =scan.nextLine();
		int[] numListTemp = new int[numList.length()]; 
		int temp;
		String result = "";
		
		for(int i=0; i<numList.length(); i++) {
			numListTemp[i] = Integer.parseInt(numList.charAt(i)+"");
		}
		
		for(int i=0; i<numList.length(); i++) {
//			System.out.println(numListTemp[i]);
			for(int j=i+1; j<numList.length(); j++) {
				if(numListTemp[i] < numListTemp[j]) {
					temp = numListTemp[i];
					numListTemp[i] = numListTemp[j];
					numListTemp[j] = temp;
				}
			}
			result +=String.valueOf(numListTemp[i]);
		}
		System.out.println(result);
	}
}
