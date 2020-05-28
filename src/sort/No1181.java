package sort;

import java.util.Scanner;

public class No1181 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		String[] list = new String[size];
		String temp ="";
		
		for(int i=0; i<size; i++) {
			list[i] = scan.nextLine();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i].length() > list[j].length()) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}else if(list[i].length() == list[j].length()) {
					if(list[i].equals(list[j])) {
						continue;
					}
					for(int t=0; t<list[i].length(); t++) {
						if((int)list[i].charAt(t) > (int)list[j].charAt(t)) {
							temp = list[i];
							list[i] = list[j];
							list[j] = temp;
							break;
						}else if(list[i].charAt(t) < list[j].charAt(t)) {
							break;
						}
					}
				}
			}
			System.out.println(list[i]);
		}
	}
}
