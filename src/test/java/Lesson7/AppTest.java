package Lesson7;

//import static org.assertj.core.api.Assertions.as;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void Testsum() {
        var expected = 5;
        var actual = App.sum(3, 2);
        assertEquals(expected, actual);
    }
}