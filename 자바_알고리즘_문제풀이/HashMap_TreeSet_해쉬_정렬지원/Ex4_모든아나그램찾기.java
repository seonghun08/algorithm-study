package HashMap_TreeSet_해쉬_정렬지원;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_모든아나그램찾기 {
    public static int solution(String s, String t) {
        int answer = 0;
        int lt = 0;
        int rt = t.length() - 1;
        char[] cs = s.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = lt; i < rt; i++) {
            sMap.put(cs[i], sMap.getOrDefault(cs[i], 0) + 1);
        }

        while (rt < s.length()) {
            sMap.put(cs[rt], sMap.getOrDefault(cs[rt], 0) + 1);
            if (sMap.equals(tMap)) answer++;

            sMap.put(cs[lt], sMap.get(cs[lt]) - 1);
            if (sMap.get(cs[lt]) == 0) sMap.remove(cs[lt]);

            lt++;
            rt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        System.out.println(solution(s, t));
    }
}