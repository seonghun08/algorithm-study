package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex5_중복확인 {
    private String solution(int n, int[] arr) {
        String answer = "U";
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                if (i == t) continue;
                if (arr[i] == arr[t]) return "D";
            }
        }
        return answer;
    }

    private String solution2(int n, int[] arr) {
        String answer = "U";
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
        for (int x : map.values()) if (x != 1) return "D";
        return answer;
    }

    private String solution3(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return "D";
        }
        return "U";
    }

    private char solution4(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        return set.size() == n ? 'U' : 'D';
    }

    public static void main(String[] args) {
        Ex5_중복확인 main = new Ex5_중복확인();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
//        System.out.println(main.solution(n, arr));
//        System.out.println(main.solution2(n, arr));
        System.out.println(main.solution3(n, arr));
    }
}
