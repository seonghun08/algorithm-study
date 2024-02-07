package array;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] score = {65, 90, 80, 95, 70, 55};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
