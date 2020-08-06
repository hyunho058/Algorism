package sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] numList={5,3,2,1,4,7,6,11};
		int swap;
		int minNum;
		
		for(int i=0; i<numList.length; i++) {
			minNum = i;
			for(int j=i+1; j<numList.length; j++) {
				if(numList[minNum] > numList[j]) {
					minNum = j;
				}
			}
			if(numList[i] > numList[minNum]) {
				swap = numList[i];
				numList[i] = numList[minNum];
				numList[minNum] = swap;
			}
			System.out.print(numList[i]+" ");
		}
	}
}
