package Lesson5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void returnMassiveInt() {
        int[] data = {1, 2, 3};
        int[] dataNull = null;
        char[] data2 = {'a', 'b', 'c'};
        var bul = 5 + 5 == 10;


        User user1 = new User("Ivan", LocalDate.of(1990, 03, 11));
        User user2 = new User("Ivan", LocalDate.of(1990, 03, 11));
        User user3 = new User("John", LocalDate.of(1990, 03, 11));
        User user4 = new User("John", null);
        User user5 = new User("John", null);
        User user6 = new User(null, null);



        assertThat(App.returnMassiveInt(data)).hasSize(3);
        assertThat(App.returnMassiveChar(data2)).hasSameSizeAs(new String[]{"sw", "ed", "dwd"});
        assertThat(data).isNotNull();
        assertThat(data2).isNotNull();
        assertThat(bul).isTrue();
        assertThat(1).isIn(1, 2, 3, 4);
        assertThat(9).isBetween(9, 11);
        assertThat(10).isStrictlyBetween(9, 11);

        //reverse-versions

        assertThat(dataNull).isNull();
        assertThat(data).isNotNull();

        assertThat(true).isTrue();
        assertThat(false).isFalse();

        assertThat(1).isIn(1, 2, 3, 4);
        assertThat(1).isNotIn(2, 3, 4, 5);

        //comparing objects

        assertThat(user1).isEqualTo(user1);
        //assertThat(user1).isEqualTo(user3);
        assertThat(user1).isEqualToComparingFieldByField(user2);
        //assertThat(user1).isEqualToComparingFieldByField(user3);
        assertThat(user4).isEqualToComparingFieldByField(user5);
        assertThat(user1).isEqualToComparingOnlyGivenFields(user3);
        //assertThat(user4).hasAllNullFieldsOrProperties();
        assertThat(user6).hasAllNullFieldsOrProperties();


        var a = "Hello, world!";
        assertThat(a)
                .startsWith("Hello")
                .contains("llo, ")
                .endsWith("!");
    }
}



