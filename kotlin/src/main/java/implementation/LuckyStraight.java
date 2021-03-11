package implementation;

import java.util.Scanner;

public class LuckyStraight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mNumList = scanner.next();
        System.out.println("RESULT = "+skill(mNumList));
    }

    public static String skill(String numList){
        int leftSum = 0;
        int rightSum = 0;

        if (numList.length()%2 != 0){
            return "Odd number";
        }else {

            for (int i = 0; i < numList.length()/2; i++){
                leftSum += Integer.parseInt(numList.charAt(i)+"");
                rightSum += Integer.parseInt(numList.charAt(i+(numList.length()/2))+"");
            }
            return leftSum == rightSum ? "LUCKY":"READY";
        }
    }
}
