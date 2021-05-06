package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    // 3개의 숫자가 담길 때까지
    // 만약 이미 존재하는 숫자라면 담지 않는다.
    // 만약 존재하지 않는 숫자라면 담는다.
    public List<Integer> createRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int number = new Random().nextInt(9) + 1;
            numbers.add(number);
        }
        return null;
    }

}
