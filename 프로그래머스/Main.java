import java.util.*;

public class Main {
    public static ArrayList<String> solution(String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        // 1:가위, 2:바위, 3:보
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) System.out.println("D");
            else if (a[i] == 1 && b[i] == 3) System.out.println("A");
            else if (a[i] == 2 && b[i] == 1) System.out.println("A");
            else if (a[i] == 3 && b[i] == 2) System.out.println("A");
            else System.out.println("B");
        }
    }
}