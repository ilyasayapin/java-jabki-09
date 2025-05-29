package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {

    // 2. Создайте список из 5 целых чисел. Выведите его элементы через пробел.
    public static String prntList(List<Integer> list) {
        String printList = new String();
        for (Integer i : list) {
            printList = printList + i + " ";
        }
        return (printList);
    }

    // 3. Выведите третий элемент списка
    public static Integer getThirdElement(List<Integer> list) {
        return list.get(2);
    }

    // 4. Удалите второй элемент списка и выведите оставшиеся
    public static List<Integer> rmvSecondElement(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        newList.remove(1);
        return newList;
    }


          /*

    //    5. Найдите сумму всех чисел в списке
    int sum = 0;
        for(
    int i = 0; i<list.size();i++)

    {
        sum += list.get(i);
    }
        System.out.println(sum);

    //    6. Подсчитайте, сколько раз в списке встречается число 7
    int amount = 0;
        for(
    int i = 0; i<list.size();i++)

    {
        if (list.get(i).equals(7)) {
            amount++;
        }
    }
        System.out.printf("Число 7 повторяется в списке %s раз",amount);
        System.out.println();

//    7. Проверьте, содержится ли число 42 в списке
        if(list.contains(42))

    {
        System.out.println("Число 42 есть в списке");
    } else

    {
        System.out.println("Число 42 в списке отсутствует");
    }

    //    8. Найдите и выведите минимальное и максимальное число в списке
    int min = list.get(0);
    int max = list.get(0);
        for(
    int i = 1; i<list.size();i++)

    {
        if (list.get(i) < min) {
            min = list.get(i);
        } else if (list.get(i) > max) {
            max = list.get(i);
        }
    }
        System.out.println("Минимальный элемент: "+min);
        System.out.println("Максимальный элемент: "+max);

//    9. Удалите из списка все числа, делящиеся на 2.
        for(
    int i = list.size() - 1;
    i >=0;i--)

    {
        if (list.get(i) % 2 == 0) {
            list.remove(i);
        }
    }
        System.out.println(list);

    //    10. Создайте список из массива int[] arr = {1, 2, 3, 4}.
    int[] arr = {1, 2, 3, 4};
    List<Integer> spisok = new ArrayList<>();
        for(
    int p :arr)

    {
        spisok.add(p);
    }

    //    11. Найдите количество элементов, больше чем число N
    Integer[] array = {1, 9, 15, 7, 6, 10};
    List<Integer> newList = Arrays.asList(array);
    int n = 7;
    int count = 0;
        for(
    int x :newList)

    {
        if (x > n) {
            count++;
        }
    }
        System.out.printf("Количество элементов, больше чем число %s, равно %s",n,count);

    //    12. Создайте список строк. Выведите строки, длина которых больше 5
    List<String> myList = new ArrayList<String>();
        myList.add("5букв");
        myList.add("6 букв");
        myList.add("7 буков");
        for(
    String y :myList)

    {
        if (y.length() > 5)
            System.out.println(y);
    }

//    13. Напишите метод, который возвращает список в обратном порядке
        System.out.println(InvertList.shuffle(list));

    //    14. Даны два списка. Объедините их в один, не добавляя повторы
    List<Integer> ListOne = new ArrayList<Integer>();
        ListOne.add(1);
        ListOne.add(2);
        ListOne.add(3);
    List<Integer> ListTwo = new ArrayList<Integer>();
        ListTwo.add(4);
        ListTwo.add(2);
        ListTwo.add(5);
        ListTwo.add(6);
    List<Integer> resultList = new ArrayList<Integer>();
        resultList.addAll(ListOne);
        for(
    Integer num :ListTwo)

    {
        if (!ListOne.contains(num)) {
            resultList.add(num);
        }
    }
        System.out.println("Объединенный лист:"+resultList);

    //    15. Считайте List<Integer> и посчитайте сумму только нечётных чисел
    int sumOdd = 0;
        for(
    int z :resultList)

    {
        if (z % 2 != 0) {
            sumOdd = sumOdd + z;
        }
    }
        System.out.println("Сумма четных чисел: "+sumOdd);

    //    16. Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"
    List<String> food = new ArrayList<String>();
        food.add("Арбуз");
        food.add("Тыква");
        food.add("Абрикос");
        food.add("Помидор");
    List<String> foodOnA = new ArrayList<String>();
        for(
    String j :food)

    {
        if (j.startsWith("А")) {
            foodOnA.add(j);
        }
    }
        System.out.println("Строки на А: "+foodOnA);

*/

    }
