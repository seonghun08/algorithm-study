package level0;

// 120842
public class 이차원으로만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int t = 0; t < n; t++) {
                answer[i][t] = num_list[index];
                index++;
            }
        }
        return answer;
    }
}
