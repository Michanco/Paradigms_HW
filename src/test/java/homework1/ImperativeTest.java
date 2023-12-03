package homework1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static homework1.Imperative.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ImperativeTest {


    @Test
    void isInvertSortTest() {
        assertTrue(isInvertSort(0));
    }

    @Test
    void sortArrayTest() {
        int[] testArr = new int[]{6, 4, 5, 3 };
        assertThat(sortArray(testArr, 2)).isEqualTo(new int[]{3, 4, 5, 6});
    }
    @Test
    void sortArrayReverseTest(){
        int[] testArr = new int[]{3, 4, 5, 6 };
        assertThat(sortArray(testArr, 0)).isEqualTo(new int[]{6, 5, 4, 3});
    }
}