package Lesson2;

import static Lesson2.StringUtils.capitalize;

public class App {
    public static void main(String[] args) {
        var test1 = capitalize("hello");
        var test2 = len("testtttt");
        //var test3 = len(null);

        System.out.println(test2);
        //System.out.println(test3);
        System.out.println(test1);
        StringUtilsTest.testCapitalize();

    }
    public static int len(String text) {
        return text.length();
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

    class StringUtilsTest {
        public static void testCapitalize() {
            if (!"Hello".equals(capitalize("hello"))) {
                throw new AssertionError("Method work incorrectly!");
            }
            if (!"".equals(StringUtils.capitalize(""))) {
                throw new AssertionError("Method work incorrectly with void string");
            }
            System.out.println("Correct work!");
        }
    }





