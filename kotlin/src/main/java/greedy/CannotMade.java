package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class CannotMade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numList = new int[N];
        for (int i = 0; i < N; i++){
            numList[i] = scanner.nextInt();
        }
        System.out.println("RESULT==="+cannotMade(numList));

    }

    public static int cannotMade(int[] numList){
        int result = 1;
        Arrays.sort(numList);

        for (int number : numList){
           if(number > result){
               break;
           }
           result += number;
        }
        return result;
    }
}
