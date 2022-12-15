package level0;

// 120829
public class 각도기 {
    public int solution(int angle) {
        if (angle > 0 && angle < 90) return 1;
        if (angle == 90) return 2;
        if (angle > 90 && angle < 180) return 3;
        if (angle == 180) return 4;
        return 0;
    }
}
