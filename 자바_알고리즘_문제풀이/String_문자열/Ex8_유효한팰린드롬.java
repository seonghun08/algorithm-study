package String_문자열;

import java.util.Scanner;

// found7, time: study; Yduts; emit, 7Dnuof
public class Ex8_유효한팰린드롬 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Ex8_유효한팰린드롬 ex = new Ex8_유효한팰린드롬();
        System.out.println(ex.solution(str));
    }

    public String solution(String str) {
        // ("[^A-Z]", "")
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse) ? "YES" : "NO";
    }
}
