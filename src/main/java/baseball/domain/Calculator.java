package baseball.domain;

public class Calculator {
    public int result = 0;

    public Calculator() {

    }

    public int add(int number1, int number2) {
        result = number1 + number2;
        return result;
    }
}
