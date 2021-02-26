package greedy;

import java.util.Scanner;

public class NumberOfCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] numberList = new int[N];
        for (int i = 0; i < N; i++){
            if ((numberList[i] = scanner.nextInt()) > M){
                System.out.println("3 보다 큽니다 다시 입력하세요");
                i--;
            }
        }
        System.out.println(numberOfCases(numberList));
    }

    public static int numberOfCases(int[] numList){
        int result = 0;

        for (int i=0; i<numList.length-1; i++){
            for (int j=i+1; j<numList.length; j++){
                result++;
                if (numList[i] == numList[j]){
                    result--;
                }

            }
        }
        return result;
    }
}
