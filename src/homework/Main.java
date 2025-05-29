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
        System.out.println("Третий элемент списка: " + Methods.getThirdElement(list));

//    4. Удалите второй элемент списка и выведите оставшиеся
        System.out.println(Methods.rmvSecondElement(list));

//    5. Найдите сумму всех чисел в списке
        System.out.println("Сумма чисел в списке: " + Methods.sumOfList(list));

//    6. Подсчитайте, сколько раз в списке встречается число 7
        System.out.printf("Число 7 повторяется в списке %s раз", Methods.count(list));
        System.out.println();

//    7. Проверьте, содержится ли число 42 в списке
        Methods.chek(list);

//    8. Найдите и выведите минимальное и максимальное число в списке
        Methods.minMax(list);

//    9. Удалите из списка все числа, делящиеся на 2.
        System.out.println(Methods.delChetn(list));

//    10. Создайте список из массива int[] arr = {1, 2, 3, 4}.
        int[] arr = {1, 2, 3, 4};
        System.out.println(Methods.spisok(arr));




    }
}

