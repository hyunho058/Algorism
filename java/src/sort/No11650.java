package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No11650 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[][] positionList = new int[size][2];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<2; j++) {
				positionList[i][j]=scan.nextInt();
			}
		}
		scan.close();
		Arrays.sort(positionList,new Comparator<int[]>() { //Comparator 인터페이스 재정의

			@Override
			public int compare(int[] x, int[] y) {
				 if(x[0]==y[0]) {// x좌표의 값이 같다면 y좌표를 기준으로 정렬		
					return Integer.compare(x[1], y[1]);
				 }
				return Integer.compare(x[0], y[0]); // 나머지는 x좌표를 기준으로 정렬
			}		
		});
		for(int i=0;i<positionList.length;i++) {
				System.out.println(positionList[i][0]+" "+positionList[i][1]);
		}
	}
}
