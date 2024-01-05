package Lesson6;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.isEmpty();
        stack.push(1);
        stack.push(43);
        stack.push(24556);
        stack.push(33);
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());


    }
}
