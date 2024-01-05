package Lesson6.Homework;

public interface Validator {
    boolean isValid(Object value);
    void required();
    void positive();
}
