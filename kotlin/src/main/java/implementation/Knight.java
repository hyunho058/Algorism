package implementation;

import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mPosition = scanner.next();
        scanner.nextLine();
        System.out.println("RESULT==" + result(mPosition));
        scanner.close();
    }

    public static int result (String position){
        int numberOfCase = 0;
        int x = (int)position.charAt(0);
        int y = Integer.parseInt(position.charAt(1)+"");
        System.out.println("X==" + x +"/" + "Y=="+y);

        int[][] numberCase = {{2,1}, {2,-1}, {1,2}, {1,-2}, {-2,1}, {2,-1}, {-1,-2}, {-1,2}};

        for (int i = 0; i < numberCase.length; i++){
            int resultX = x + numberCase[i][0];
            int resultY = y + numberCase[i][1];

            if (resultY <= 0 || resultY > 8 || resultX <= 97 || resultX > 104){
                continue;
            }
            numberOfCase ++;
        }
        return numberOfCase;
    }
}
