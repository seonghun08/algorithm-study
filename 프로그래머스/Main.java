import level0.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String myString = "hello world!!";
        String collect = Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());

        myString.chars().mapToObj(Character::toString).distinct().collect(Collectors.joining())

        System.out.println(collect);
    }
}
