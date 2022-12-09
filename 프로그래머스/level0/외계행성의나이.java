package level0;

// 120834, 눈에 보이는 것과 다르게 switch 활용이 더 빠르다...?
public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        while (age > 0) {
            int num = age % 10;
            age /= 10;
            switch (num) {
                case 0:
                    answer = 'a' + answer;
                    break;
                case 1:
                    answer = 'b' + answer;
                    break;
                case 2:
                    answer = 'c' + answer;
                    break;
                case 3:
                    answer = 'd' + answer;
                    break;
                case 4:
                    answer = 'e' + answer;
                    break;
                case 5:
                    answer = 'f' + answer;
                    break;
                case 6:
                    answer = 'g' + answer;
                    break;
                case 7:
                    answer = 'h' + answer;
                    break;
                case 8:
                    answer = 'i' + answer;
                    break;
                case 9:
                    answer = 'j' + answer;
                    break;
            }
        }
        return answer;
    }

    public String solution2(int age) {
        String answer = "";
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        while (age > 0) {
            answer = chars[age % 10] + answer;
            age /= 10;
        }
        return answer;
    }

}
