package HashMap_TreeSet_해쉬_정렬지원;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex5_K번째큰수 {
    public static int solution(int n, int k, int[] arr) {
        int answer = -1;

        /**
         * "Set"은 중복제거를 위해 사용한다. -> "TreeSet"은 중복제거 뿐만이 아닌 이진탐색트리로 정렬 해준다.
         * Collections.reverseOrder() 내림차순 정렬할 때 사용
         *
         * ts.remove(143); 143에 해당하는 값이 있다면 제거
         * ts.size(); ts 길이 반환
         * ts.first(); 오름차순이면 최솟값, 내림차순이면 최댓값
         * ts.last(); 오른차순이면 최댓값, 내림차순이면 최솟값
         */
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int t = i + 1; t < n; t++) {
                for (int j = t + 1; j < n; j++) {
                    ts.add(arr[i] + arr[t] + arr[j]);
                }
            }
        }

        int cnt = 0;
        for (int a : ts) {
            cnt++;
            if (cnt == k) return a;
        }

        return answer;
    }

    /**
     * 10 3
     * 13 15 34 23 45 65 33 11 26 42
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int k = Integer.parseInt(in.next());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        System.out.println(solution(n, k, arr));
    }
}