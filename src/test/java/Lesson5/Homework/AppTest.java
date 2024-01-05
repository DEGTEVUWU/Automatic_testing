package Lesson5.Homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void gt() {
        assertThat(App.gt(100, 40)).isTrue();
        assertThat(App.gt(40, 400)).isFalse();
        assertThat(App.gt(40, 40)).isFalse();

    }
}