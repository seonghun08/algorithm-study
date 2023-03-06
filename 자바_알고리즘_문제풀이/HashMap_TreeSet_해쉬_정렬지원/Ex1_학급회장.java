package HashMap_TreeSet_해쉬_정렬지원;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1_학급회장 {
    public static char solution(int n, String s) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution(n, s));
    }
}