package level2;

public class N개의최소공배수 {
    class Solution {
        public int solution(int[] arr) {
            int answer = arr[0];

            for (int i = 1; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
            }

            return answer;
        }

        public int lcm(int a, int b) {
            return a * b / gcd(a, b);
        }

        public int gcd(int a, int b) {
            while (b != 0) {
                int tmp = b;
                b = a % b;
                a = tmp;
            }
            return a;
        }
    }
}
