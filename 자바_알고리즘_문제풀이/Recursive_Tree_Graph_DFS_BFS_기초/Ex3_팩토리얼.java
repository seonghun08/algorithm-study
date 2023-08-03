package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.Scanner;

public class Ex3_팩토리얼 {
    private int solution(int n) {
        if (n > 1) return n * solution(n - 1);
        else return 1;
    }

    public static void main(String[] args) {
        Ex3_팩토리얼 main = new Ex3_팩토리얼();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}
