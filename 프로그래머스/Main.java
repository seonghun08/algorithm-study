import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
//        new BlockTest<Object>();
//        Object item = BlockTest<String>.item;

//        System.out.println(item);
    }

    static class BlockTest<T> {
        public static <T extends String> int set(List<T> t1) {
            System.out.println(t1);
            return 0;
        }
    }
}
