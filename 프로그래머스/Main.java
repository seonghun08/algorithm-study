import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        char fir; char las = lastCh(words[0]);

        HashSet<String> log = new HashSet<>();
        log.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            fir = firstCh(words[i]);
            log.add(words[i]);

            if (fir != las || log.size() != i + 1) { // 중복 길이 체크
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            las = lastCh(words[i]);
        }
        return answer;
    }

    private char firstCh(String s) {
        return s.charAt(0);
    }

    private char lastCh(String s) {
        return s.charAt(s.length() - 1);
    }
}