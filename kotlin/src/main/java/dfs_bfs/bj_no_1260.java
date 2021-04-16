package dfs_bfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 * <p>
 * 입력
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
 * 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
 * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 * <p>
 * 출력
 * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
 * <p>
 * DFS - stack or 재귀함수
 * BFS - Queue
 */
public class bj_no_1260 {

    static boolean[][] check;   //연결 상태
    static boolean[] checked;
    static int n;   //정점 수
    static int m;   //간선 수
    static int v;   //시작


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        m = scanner.nextInt();
//        v = scanner.nextInt();

        n = 5;
        m = 5;
        v = 3;

        int[] xList = {5, 5, 1, 3, 3};
        int[] yList = {4, 2, 2, 4, 1};


        check = new boolean[1001][1001];
        checked = new boolean[1001];

        for (int i = 0; i < m; i++) {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            check[x][y] = check[y][x] = true;

            check[xList[i]][yList[i]] = check[yList[i]][xList[i]] = true;
        }
//        bfs_1();
        bfs();
//        dfs(v);
        checked = new boolean[1001];
        System.out.println(" ");

    }

    public static void dfs(int i) {
        checked[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= n; j++) {
            if (check[i][j] && !checked[j]) {
                dfs(j);
            }
        }
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        checked[v] = true;
        System.out.print(v + " ");

        //Queue가 빌때까지 반복, 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (check[temp][i] && !(checked[i])) {
                    queue.offer(i);
                    checked[i] = true;
                    System.out.print("/ " + i + " ");
                }
            }
        }
    }
}


