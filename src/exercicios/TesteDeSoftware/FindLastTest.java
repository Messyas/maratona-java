package exercicios.TesteDeSoftware;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindLastTest {

    private int[] array;
    private int valueToFind;

    @BeforeEach
    void setUp() {
        array = new int[] {2,3,5};
        valueToFind = 2;
    }

    @Test
    @DisplayName("teste de index")
    void testFindLast() {
        int expectedIndex = 0;
        int actualIndex = FindLast.findLast(array,valueToFind);
        assertEquals(expectedIndex, actualIndex, "Expected index does not match actual index");
    }
}
