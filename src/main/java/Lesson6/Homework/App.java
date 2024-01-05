package Lesson6.Homework;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        var validator = new Right();
        System.out.println(validator.isValid(null));
        System.out.println(validator.isValid("some string"));
        validator.required();
        System.out.println(validator.isValid(null));
        System.out.println(validator.isValid(777));

        validator.positive();

        System.out.println(validator.isValid(5));
        System.out.println(validator.isValid(-1));


        //test list with predicate
        List<Predicate> tests = new ArrayList<>();
        tests.add(v -> v == null);
        //tests.add(v -> (int) v > 0);
        for (var test : tests) {
            if (!(test.test(null))) {
                System.out.println("Its incorrect!!!");;
            }
            System.out.println("Its correct!");
        }


    }
}
