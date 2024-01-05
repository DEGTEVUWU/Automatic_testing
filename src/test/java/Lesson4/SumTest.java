package Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SumTest {
    @Test
    public void Test1() {

        var test1 = Sum.sum(1, 1);
        assertThat(test1).isEqualTo(2);
    }

}