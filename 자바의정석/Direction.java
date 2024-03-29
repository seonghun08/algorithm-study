public enum Direction { // enum Direction
    EAST(1, ">"), SOUTH(2, "v"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;

    Direction(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return this.value;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public static Direction of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("invalid value:" + dir);
        }
        return DIR_ARR[dir - 1];
    }

    public Direction rotate(int num) { // num 의 값만큼 90도씩 시계 방향으로 회전시킨다.
        num = num % 4;
        if (num < 0) {
            num += 4;
        }
        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getSymbol();
    }
}

class EnumEx {
    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }
        // System.out.println(Direction.of(1));
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);
        System.out.printf("d1=%s, d1.name()=%s, d1.getValue()=%s, d1.getSymbol()=%s\n", d1, d1.name(), d1.getValue(), d1.getSymbol());
        System.out.printf("d2=%s, d2.name()=%s, d2.getValue()=%s, d2.getSymbol()=%s\n", d2, d2.name(), d2.getValue(), d2.getSymbol());

        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));
    }
}