package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.*;

public class Ex8_송아지찾기1_BFS {

    /**
     * dis: 이동 방식을 배열에 모두 저장
     * ch: n번의 이동이 있을 때마다 중복되는 좌표 방지
     * Q: n번의 이동이 있을 때마다 새로운 값을 저장
     *
     * 이동 방식에 따라 1번의 이동이 있다고 가정하며, 1번의 이동마다 level + 1이 증가한다고 하자.
     * 예를 들어 시작 좌표가 5 인 경우 모든 경우의 수(1, -1, 5)를 보면 6, 4, 10로 나뉠 것이다.
     * 현재 level1의 상태로 2번째 이동이 발생한다고 하자. (즉 level2의 상태이다.)
     * 경우의 수는 3개에서 9개로 늘어날 것이다.
     * 6 → {7, 5, 11}, 4 → {5, 3, 9}, 10 → {11, 9, 15}
     *
     * 점차 경우의 수는 늘어나게 될 것이며, 목표 좌표와 일치하는 경우의 수를 찾는 과정을 거친다.
     * 최소 이동 횟 수는 곧 level 과 동일하다.
     */
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int solution(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);

        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int m : dis) {
                    int nx = x + m;
                    if (nx == e) return level + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    /**
     * - BFS: 상태 트리 탐색
     *   s: 시작 좌표, e: 목표 좌표
     *   좌표는 직선으로 되어 있으며, 좌표 점은 1 ~ 10,000 까지
     *   이동 방식은 {1, -1, 5} 총 3가지가 있으며, 목표 좌표까지 최소 몇 번을 이동을 해야 하는가?
     */
    public static void main(String[] args) {
        Ex8_송아지찾기1_BFS main = new Ex8_송아지찾기1_BFS();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        System.out.println(main.solution(s, e));
    }
}
