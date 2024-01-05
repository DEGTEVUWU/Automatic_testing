package Lesson4;

import org.apache.commons.lang3.ArrayUtils;
//import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("a!");

        int[] numbers = {1, 2, 45, 42, 2, 43};
        int[] numbers2 = {};

        var actual1 = indexOf(numbers, 2, 0);
        assert  actual1 == 1 : "This method words incorrectly";

        var actual2 = indexOf(numbers, 2, 2);
        assert  actual2 == 4 : "This method words incorrectly";

        var actual3 = indexOf(numbers, 8, 2);
        assert  actual3 == -1 : "This method words incorrectly";

        var actual4 = indexOf(numbers2, 2, 0);
        //assert  actual3 == -1 : "This method words incorrectly";

        System.out.println(indexOf(numbers2,2, 0));

    }

    public static int indexOf(int[] numbers, int value, int fromIndex) {
        return ArrayUtils.indexOf(numbers, value, fromIndex);
    }
}
