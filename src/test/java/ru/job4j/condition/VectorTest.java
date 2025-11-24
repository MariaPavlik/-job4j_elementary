package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenVectors1Minus2AndMinus34ThenResultMMinus22() {
        int x1 = 1, y1 = -2, x2 = -3, y2 = 4;
        String expected = "(-2, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus1Minus5And15ThenResult00() {
        int x1 = -1, y1 = -5, x2 = 1, y2 = 5;
        String expected = "(0, 0)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus46() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-4, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}