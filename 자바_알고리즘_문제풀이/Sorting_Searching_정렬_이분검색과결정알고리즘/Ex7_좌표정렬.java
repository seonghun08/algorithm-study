package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex7_좌표정렬 {
    /**
     * - x, y 좌표를 가질 때 만 가능
     *   삽입정렬 방식을 응용
     */
    private static int[][] solution(int n, int[][] arr) {
        int[]tmp = new int[2];

        for (int i = 0; i < n - 1; i++) {
            for (int t = i + 1; t < n; t++) {
                int idx = -1;

                if (arr[i][0] > arr[t][0]) {
                    idx = t;
                } else if (arr[i][0] == arr[t][0]) {
                    if (arr[i][1] > arr[t][1]) {
                        idx = t;
                    }
                }

                if (idx > 0) {
                    tmp[0] = arr[idx][0];
                    tmp[1] = arr[idx][1];
                    arr[idx][0] = arr[i][0];
                    arr[idx][1] = arr[i][1];
                    arr[i][0] = tmp[0];
                    arr[i][1] = tmp[1];
                }
            }
        }
        return arr;
    }

    /**
     *  - n개의 좌표를 올림차순으로 정렬
     *  5
     *  2 7       1 2
     *  1 3       1 3
     *  1 2   →   2 5
     *  2 5       2 7
     *  3 6       3 6
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
        
    }
}

/**
 * - "this"가 앞에 있을 때 올림차순이라고 기억하자.
 *   this.x - o.x → 올림차순 정렬
 *   o.x - this.x → 내림차순 정렬
 */
class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
     * x 좌표가 서로 같을 때 y 좌표를 비교
     * x 좌표가 서로 다를 경우 x 좌표를 비교
     * this - parameter → 올림차순 정렬이며, 반대의 경우 내림차순
     */
    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;  // 올림차순
        } else {
            return this.x - o.x;  // 올림차순
        }
    }
}