package homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MethodsTest {

    @Test
    void getThirdElement() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(42);
        Assertions.assertEquals(4, Methods.getThirdElement(list));
    }
}