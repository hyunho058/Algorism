package string;

import java.util.Scanner;
public class No1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine().trim().toUpperCase();
		int msgCount=0;
		String selectMsg = "";

		for(int i=0; i<msg.length(); i++){
			int count1=0;
			for(int j=i; j<msg.length(); j++){
				if(msg.charAt(i)==msg.charAt(j)) {
					count1++;
				}
			}
			if(i==0) {
				msgCount=count1;
				selectMsg=msg.charAt(i)+"";
			}else if(msgCount == count1){
				selectMsg ="?";
			}else if(msgCount < count1) {
				msgCount=count1;
				selectMsg=msg.charAt(i)+"";
			}
		}
		System.out.println(selectMsg);
		scan.close();
	}
}
