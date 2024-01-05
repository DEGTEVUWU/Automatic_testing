package Lesson3;

class HelloWorld {
    public static void main(String[] args) {
        assert 1 == 2;
        System.out.println("Hello world");
        /*
        int[] numbers  = {1, 4, 5, 75, 21, 9000};
        System.out.println(take(numbers, 2));
        /*
        int[] numbers  = {1, 4, 5, 75, 21, 9000};
        int index = 0;
        var actual1 = take(numbers, index);
        assert actual1.equals(new int[]{1}) : "This method incorrectly";

         */
    }

    public static int[] take (int[] numbers, int index) {
        int[] resultMassiveNumbers = new int[index];

        for (var i = 0; i < index; i++) {
            resultMassiveNumbers[i] = numbers[i];
        }
        return resultMassiveNumbers;
    }
}
