package homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MethodsTest {

    @Test
    void getThirdElementTest() {
        Integer[] array = {0, 1, 4, 7, 42};
        List<Integer> list = Arrays.asList(array);
        Assertions.assertEquals(4, Methods.getThirdElement(list));
    }

    @Test
    void getThirdElementTestOfLength() {
        Integer[] array = {0, 1};
        List<Integer> list = Arrays.asList(array);
        assertThrows(IllegalArgumentException.class, () -> Methods.getThirdElement(list));
    }

    @Test
    void sumOfListTest() {
        Integer[] array = {0, 1, -1, 1, 5};
        List<Integer> list = Arrays.asList(array);
        Assertions.assertEquals(6, Methods.sumOfList(list));
    }

    @Test
    void sumOddTest() {
        Integer[] array = {0, 1, 4, 7, 42};
        List<Integer> list = Arrays.asList(array);
        Assertions.assertEquals(8, Methods.sumOdd(list));
    }
}