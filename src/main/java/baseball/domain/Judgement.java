package baseball.domain;

import java.util.List;

public class Judgement {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (Integer playerNumber : player) {
            if (computer.contains(playerNumber)) {
                result++;
            }
        }

        return 0;
    }

    public boolean hasPlace(List<Integer> computer, int placeNumber, int number) {
        return false;
    }

}

