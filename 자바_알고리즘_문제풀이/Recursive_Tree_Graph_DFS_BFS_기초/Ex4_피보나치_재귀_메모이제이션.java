package Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.Scanner;

public class Ex4_피보나치_재귀_메모이제이션 {
    static int[] arr;
    private int solution1(int n) {
        /*
         * 이미 값이 저장되어 있다면 arr[n]은 0보다 크다.
         * 이를 이용해서 이미 구해진 값 이라면 재귀 호출없이 값 리턴
         */
        if (arr[n] > 0) {
            return arr[n];
        }

        if (n == 1 || n == 2) {
            return arr[n] = 1;
        } else {
            return arr[n] = solution1(n - 2) + solution1(n - 1);
        }
    }

    private int solution2(int n) {
        if (n == 1 || n == 2) return 1;
        else return solution2(n - 2) + solution2(n - 1);
    }

    /**
     * - 피보나치 수열 (재귀 함수로 출력)
     *   loop 문과 재귀 둘 중 누가 효율적인가?
     *   재귀는 스택을 쓰기 때문에 loop 문이 더 효율적이다.
     */
    public static void main(String[] args) {
        Ex4_피보나치_재귀_메모이제이션 main = new Ex4_피보나치_재귀_메모이제이션();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        arr = new int[n + 1];
        main.solution1(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
