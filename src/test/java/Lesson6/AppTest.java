package Lesson6;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.Assertions.assertThat;
class AppTest {

    @Test
    void main() {
        Stack<Integer> stack = new Stack<>();

        assertThat(stack.isEmpty()).isTrue();

        stack.push(1);
        stack.push(2);

        assertThat(stack.isEmpty()).isFalse();

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);

        assertThat(stack.isEmpty()).isTrue();

        Stack<Integer> stack2 = new Stack<>();
        //stack2.push(11);
        var thrown = catchThrowable(() -> stack2.pop());
        assertThat(thrown).isInstanceOf(EmptyStackException.class);
    }
}