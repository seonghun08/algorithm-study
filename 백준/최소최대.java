import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0;
        int count = N;
        int[] arr = new int[N];
        while(count != 0) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
            count--;
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}