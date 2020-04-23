package sort;

import java.util.Scanner;

public class No11650 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		String[] positionList = new String[size];
		String temp = "";
		
//		String test1 = "-1";
//		int test2 = Integer.parseInt("-"+test1.charAt(1)+"");
//		System.out.println(test2);
		
		for(int i=0; i<size; i++) {
			positionList[i] = scan.nextLine().trim();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				int tempI = Integer.parseInt(positionList[i].charAt(0)+"");
				int tempJ = Integer.parseInt(positionList[j].charAt(0)+"");
				int tempI1 = Integer.parseInt(positionList[i].charAt(1)+"");
				int tempJ1 = Integer.parseInt(positionList[j].charAt(1)+"");
				
				if(positionList[i].charAt(0) =='-') {
					tempI = Integer.parseInt("-"+positionList[i].charAt(1)+"");
				}
				if(positionList[j].charAt(0) =='-') {
					tempI = Integer.parseInt("-"+positionList[i].charAt(1)+"");
				}
				
				if(tempI > tempJ) {
					temp = positionList[i];
					positionList[i] = positionList[j];
					positionList[j] = temp;
				}else if(tempI == tempJ){
					if(tempI1 > tempJ1) {
						temp = positionList[i];
						positionList[i] = positionList[j];
						positionList[j] = temp;
					}
				}
				
				
//				if(positionList[i].charAt(0) == '-') {
//					
//				}
//				if(Integer.parseInt(positionList[i].charAt(0)+"") > Integer.parseInt(positionList[j].charAt(0)+"")) {
//					temp = positionList[i];
//					positionList[i] = positionList[j];
//					positionList[j] = temp;
//				}else if(Integer.parseInt(positionList[i].charAt(0)+"") == Integer.parseInt(positionList[j].charAt(0)+"")){
//					if(Integer.parseInt(positionList[i].charAt(1)+"") > Integer.parseInt(positionList[j].charAt(1)+"")) {
//						temp = positionList[i];
//						positionList[i] = positionList[j];
//						positionList[j] = temp;
//					}
//				}
			}
			System.out.println(positionList[i]);
		}
		scan.close();
	}
}
