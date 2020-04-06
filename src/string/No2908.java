package string;

import java.util.Scanner;

public class No2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine().trim();
//		System.out.println("num.length = "+num.length());
		String[] numList = num.split(" ");
		String[] num1 = new String[numList.length];
		
		for(int i=0; i<numList.length; i++) {
//			System.out.println("numList.length("+ i +") = "+numList[i].length());
//			String[] num1 = new String[numList[i].length()];
			num1[i]="";
//			System.out.println("num1.length = "+num1.length);
//			System.out.println("numList[i]="+numList[i]+", length = "+numList[i].length());
			for(int j=numList[i].length(); j>0; j--) {
//				System.out.println("j-1="+ (j-1) + "value = "+numList[i].charAt(j-1));
				num1[i] += (numList[i].charAt(j-1));
			}
//			System.out.println("i="+i+" /num1=="+num1[i]);
			
		}
		int b = (Integer.parseInt(num1[0]) > Integer.parseInt(num1[1])) ? Integer.parseInt(num1[0]) : Integer.parseInt(num1[1]); 
		System.out.println(b);
		scan.close();
	}
}
