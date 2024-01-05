package Lesson3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        if (!"".equals(StringUtils.capitalize(""))) {
            throw new AssertionError("Метод работает неверно!");
        }
        if (!"Hello".equals(StringUtils.capitalize("hello"))) {
            throw new AssertionError("Метод работает неверно!");
        }
        assert 4 == 2 + 2;
        assert "".equals(StringUtils.capitalize(""));
        assert "Hello".equals(StringUtils.capitalize("hello")) : "Ваш метод не работает!";

        int[] numbers  = {1, 4, 5, 75, 21, 9000};
        int[] numbers2  = {};

        var test1 = take(numbers, 2);

        int index = 1;
        int index2 = 10;
        int index3 = 0;

        var actual1 = take(numbers, index);
        var actual2 = take(numbers2, index);
        var actual3 = take(numbers, index2);
        var actual4 = take(numbers, index3);


        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(actual2));
        System.out.println(Arrays.toString(actual3));
        System.out.println(Arrays.toString(actual4));


        assert Arrays.equals(actual1, new int[]{1}) : "This method words incorrectly";


/*
        int[] numbers  = {1, 4, 5, 75, 21, 9000};
        int[] numbers2  = {};

        int index = 1;
        var actual1 = take(numbers, index);
        assert Arrays.equals(actual1, new int[]{1}) : "This method words incorrectly";

        int index2 = 4;
        var actual2 = take(numbers, index2);
        assert Arrays.equals(actual2, new int[]{1, 4, 5, 75}) : "This method words incorrectly";

        int index3 = 4;
        var actual3 = take(numbers2, index3);
        assert Arrays.equals(actual3, new int[]{}) : "This method words incorrectly";


 */


    }

    public static int[] take (int[] numbers, int index) {
        if (numbers.length == 0) {
            return new int[0];
        }
        if (numbers.length < index) {
            index = numbers.length;
        }
        int[] resultMassiveNumbers = new int[index];

        for (var i = 0; i < index; i++) {
            resultMassiveNumbers[i] = numbers[i];
        }
        return resultMassiveNumbers;
    }

}

class StringUtils {
    public static String capitalize(String text) {
        if ("".equals(text)) {
            return "";
        }
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
}

