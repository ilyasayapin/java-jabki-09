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

//    11. Найдите количество элементов, больше чем число N
        Integer[] array = {1, 9, 15, 7, 6, 10};
        List<Integer> newList = Arrays.asList(array);
        Methods.countMaxThenN(newList, 7);
        System.out.println();

//    12. Создайте список строк. Выведите строки, длина которых больше 5
        List<String> myList = new ArrayList<String>();
        myList.add("5букв");
        myList.add("6 букв");
        myList.add("7 буков");
        Methods.dlinnyeStroki(myList);

//    13. Напишите метод, который возвращает список в обратном порядке
        System.out.println(Methods.swap(list));

//    14. Даны два списка. Объедините их в один, не добавляя повторы
        List<Integer> listOne = new ArrayList<Integer>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        List<Integer> listTwo = new ArrayList<Integer>();
        listTwo.add(4);
        listTwo.add(2);
        listTwo.add(5);
        listTwo.add(6);
        Methods.unionLists(listOne, listTwo);

//    15. Считайте List<Integer> и посчитайте сумму только нечётных чисел
        System.out.println("Сумма нечетных чисел: " + Methods.sumOdd(list));

//    16. Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"
        List<String> food = new ArrayList<String>();
        food.add("Арбуз");
        food.add("Тыква");
        food.add("Абрикос");
        System.out.println("Список из строк на А: " + Methods.foodOnA(food));
    }
}