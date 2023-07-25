package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex6_장난꾸러기 {
    private static String solution(int n, int[] arr) {
        int p1 = 0, p2 = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) p1 = i + 1;
        }

        for (int i = 1; i < n; i++) {
            if (p1 == n - 1) {
                if (arr[p1 - 1] <= arr[i]) {
                    p2 = i; break;
                }
            } else {
                if (arr[p1 - 1] <= arr[i] && arr[p1 + 1] >= arr[i]) {
                    p2 = i; break;
                }
            }
        }

        return (p2 + 1) + " " + (p1 + 1);
    }

    private static ArrayList<Integer> solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    /**
     * 1. 자리를 바꾼 학생 기준 앞 보다 키가 작을 경우 자리 바꿈이 일어난 학생 확인 (인덱스 확인)
     *    해당 인덱스 기준 앞과 뒤의 번호 안에 포함 되는 값을 탐색
     *      + 탐색 되지 않는 경우 맨 앞에 있는 것으로 판정 되며, 초기 값 0
     *      + 해당 인덱스가 맨 마지막 번호일 경우 앞 번호보다 크거나 같은 경우일 때만 탐색
     * 
     * 2. 자리 바꿈이 일어난 순서와 정렬이 된 순서를 비교하여 값이 다를 경우 자리 바꿈이 일어난 학생 확인
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // System.out.println(solution(n, arr));
        ArrayList<Integer> answer = solution2(n, arr);
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
