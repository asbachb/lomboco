package it.impl.lomboco;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AUnitTest {

    @Test
    public void shouldReturnInsertedValue1() {
        assertTrue(new AWithLombok(true).isBool());
    }

    @Test
    public void shouldReturnInsertedValue2() {
        assertTrue(new AWithoutLombok(true).isBool());
    }
}
