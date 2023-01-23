package TwoPotinters_SlidingWindow_효율성;

import java.util.*;

public class Ex4_연속부분수열 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (m == sum) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (m == sum) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }


    /**
     * 부분수열에 음수가 있으면 슬라이디 윈도우로 해결이 되지 않는다.
     * 따라서 시간 복잡도 O(n)를 가질려면 해싱을 사용해야 한다.
     */
//    class Solution {
//        public int solution(int[] nums, int m){
//            int answer = 0;
//            HashMap<Integer, Integer> nH = new HashMap<>();
//            int sum = 0;
//            nH.put(0, 1);
//            for(int x : nums){
//                sum += x;
//                if(nH.containsKey(sum-m)) answer += nH.get(sum-m);
//                nH.put(sum, nH.getOrDefault(sum, 0) + 1);
//            }
//            return answer;
//        }
//        public static void main(String[] args){
//            Solution T = new Solution();
//            System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
//            System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
//            System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
//            System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
//        }
}
