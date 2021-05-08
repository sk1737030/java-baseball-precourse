package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RefereeTest {
    private Referee referee;
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }


    @Test
    void 스트라이크3() throws Exception {
        // Given
        List<Integer> players = Arrays.asList(1, 2, 3);

        // When
        String result = referee.compare(ANSWER, players);
        // Then
        assertNotEquals("0 볼 2 스트라이크", result);
        assertEquals("0 볼 3 스트라이크", result);
    }

    @Test
    void 볼() throws Exception {
        // Given
        List<Integer> players = Arrays.asList(2, 3, 1);
        // When
        String result = referee.compare(ANSWER, players);
        // Then
        assertEquals("3 볼 0 스트라이크", result);
    }

    @Test
    void 아웃() throws Exception {
        // Given
        List<Integer> players = Arrays.asList(1, 2, 3);
        // When

        String result = referee.compare(ANSWER, players);
        // Then
        assertEquals("아웃", result);
    }
}
