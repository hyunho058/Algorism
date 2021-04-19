package dfs_bfs;

import java.util.Scanner;

public class bj_no_2606 {

    static boolean[][] check;   //연결 상태
    static boolean[] checked;
    static int n;   //정점 수
    static int m;   //간선 수
    static int startPoint;   //시작
    static int virusCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        m = scanner.nextInt();
//        v = scanner.nextInt();

        n = 7;
        m = 6;
        startPoint = 1;

        int[] xList = {1, 2, 1, 5, 5, 4};
        int[] yList = {2, 3, 5, 2, 6, 7};

        check = new boolean[1001][1001];
        checked = new boolean[1001];

        for (int i = 0; i < m; i++) {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            check[x][y] = check[y][x] = true;

            check[xList[i]][yList[i]] = check[yList[i]][xList[i]] = true;
        }
        dfs(startPoint);
        checked = new boolean[1001];
        System.out.println("");
        System.out.println("RESULT = "+virusCount);

    }

    public static void dfs(int i) {
        checked[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= n; j++) {
            if (check[i][j] && !checked[j]) {
                virusCount ++;
                dfs(j);
            }
        }
    }
}
