package greedy;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("RESULT==="+reverseCount(scanner.nextLine()));
        scanner.nextLine();
    }

    public static int reverseCount(String str){
        int zeroCount = 0;
        int oneCount = 0;
        String strTemp ="";
        strTemp = String.valueOf(str.charAt(0));

        for (int i = 1; i < str.length(); i++){
            if (strTemp.equals(String.valueOf(str.charAt(i)))){

            }else {
                if (strTemp.equals("0")){
                    zeroCount++;
                }else {
                    oneCount++;
                }
                strTemp = String.valueOf(str.charAt(i));
            }
        }

        if (zeroCount > oneCount){
            return oneCount;
        }else if (zeroCount < oneCount){
            return zeroCount;
        }else {
            return zeroCount;
        }



//        return result;
    }
}
