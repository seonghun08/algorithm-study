package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.Scanner;

public class Ex6_부분집합_구하기_DFS {

    static int n;
    static int[] ch;

    public static void DFS(int L) {
        if (L == n + 1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    sb.append(i).append(" ");
                }
            }
            if (sb.length() > 0){
                System.out.println(sb);
            }
        } else { // 재귀
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new int[n + 1];
        DFS(1);
    }
}
