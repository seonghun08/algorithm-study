package array;

public class ArrayEx01 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;
        int[] score = {100, 90, 80, 95, 70};

        for (int n : score) {
            sum += n;
        }

        average = (float) sum / score.length; // 타입이 서로 다르고 둘 중 크기가 더 큰 타입으로 형변환 된다.

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
