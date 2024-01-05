package Lesson6.Homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    public void TestValidator() {
        var validator = new Right();

        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid("some test lol wow")).isFalse();
        assertThat(validator.isValid(567)).isTrue();

        validator.required();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(778)).isTrue();

        validator.positive();
        assertThat(validator.isValid(55)).isTrue();
        assertThat(validator.isValid(0)).isFalse();
        assertThat(validator.isValid(-7)).isFalse();


    }


}