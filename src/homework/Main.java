package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//    2. Создайте список из 5 целых чисел. Выведите его элементы через пробел.
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(42);
        System.out.println(Methods.prntList(list));

//    3. Выведите третий элемент списка
        System.out.println(Methods.getThirdElement(list));

//    4. Удалите второй элемент списка и выведите оставшиеся
        System.out.println(Methods.rmvSecondElement(list));



    }
}

