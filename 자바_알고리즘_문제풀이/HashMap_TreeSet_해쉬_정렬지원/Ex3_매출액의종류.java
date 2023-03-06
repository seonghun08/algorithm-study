package HashMap_TreeSet_해쉬_정렬지원;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3_매출액의종류 {
    public static ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int lt = 0;
        int rt = k - 1;

        for (int i = lt; i < rt; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        while (rt < n) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());

            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);

            lt++;
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int k = Integer.parseInt(in.next());

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        ArrayList<Integer> answer = solution(n, k, arr);
        for (int num : answer) {
            System.out.println(num + " ");
        }
    }
}
