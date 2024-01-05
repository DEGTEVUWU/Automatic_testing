package Lesson5;
import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println(returnMassiveChar(new char[]{'d', 's'}));
        User user1 = new User("Ivan", LocalDate.of(1990, 03, 11));
        User user2 = new User("Ivan", LocalDate.of(1990, 03, 11));
        User user3 = new User("John", LocalDate.of(1992, 04, 17));


    }

    public static int[] returnMassiveInt (int[] massive) {
        int[] newMassive = massive;
        return newMassive;
    }

    public static char[] returnMassiveChar (char[] massive) {
        char[] newMassive = massive;
        return newMassive;
    }
}
