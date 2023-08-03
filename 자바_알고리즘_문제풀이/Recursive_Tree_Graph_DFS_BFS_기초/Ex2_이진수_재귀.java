package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.Scanner;

public class Ex2_이진수_재귀 {
    private void solution(int n) {
        if (n > 0) {
            solution(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Ex2_이진수_재귀 main = new Ex2_이진수_재귀();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main.solution(n);
    }
}
