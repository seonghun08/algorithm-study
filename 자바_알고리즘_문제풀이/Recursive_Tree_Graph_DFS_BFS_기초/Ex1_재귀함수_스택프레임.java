package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.Scanner;

public class Ex1_재귀함수_스택프레임 {
    private void solution(int n) {
        if (n > 0) {
            // System.out.print(n + " "); // n, n-1, n-2, ... n-(n-1)
            solution(n - 1);
            System.out.print(n + " ");  // n-(n-1), n-(n-2), ... n
        }
    }

    public static void main(String[] args) {
        Ex1_재귀함수_스택프레임 main = new Ex1_재귀함수_스택프레임();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main.solution(n);
    }
}
