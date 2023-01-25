package HashMap_TreeSet_해쉬_정렬지원;

import java.util.*;

public class Ex2_아나그램 {
    public static String solution(String s1, String s2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) return "NO";
            map.put(ch, map.get(ch) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.println(solution(s1, s2));
    }
}