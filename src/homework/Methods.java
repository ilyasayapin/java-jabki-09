package homework;

import java.util.ArrayList;
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

    // 5. Найдите сумму всех чисел в списке
    public static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    // 6. Подсчитайте, сколько раз в списке встречается число 7
    public static int count(List<Integer> list) {
        int amount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(7)) {
                amount++;
            }
        }
        return amount;
    }

    // 7. Проверьте, содержится ли число 42 в списке
    public static void chek(List<Integer> list) {
        if (list.contains(42)) {
            System.out.println("Число 42 есть в списке");
        } else
            System.out.println("Число 42 в списке отсутствует");
    }

    // 8. Найдите и выведите минимальное и максимальное число в списке
    public static void minMax(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            } else if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    // 9. Удалите из списка все числа, делящиеся на 2.
    public static List<Integer> delChetn(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        for (int i = newList.size() - 1;
             i >= 0; i--) {
            if (newList.get(i) % 2 == 0) {
                newList.remove(i);
            }
        }
        return newList;
    }

    // 10. Создайте список из массива int[] arr = {1, 2, 3, 4}.
    public static List<Integer> spisok(int[] arr) {
        List<Integer> spisok = new ArrayList<>();
        for (int p : arr) {
            spisok.add(p);
        }
        return spisok;
    }

    // 11. Найдите количество элементов, больше чем число N
    public static void countMaxThenN(List<Integer> list, int n) {
        int count = 0;
        for (int x : list) {
            if (x > n) {
                count++;
            }
        }
        System.out.printf("Количество элементов, больше чем число %s, равно %s", n, count);
    }

    // 12. Создайте список строк. Выведите строки, длина которых больше 5
    public static void dlinnyeStroki(List<String> list) {
        for (String y : list) {
            if (y.length() > 5)
                System.out.println(y);
        }
    }

    // 13. Напишите метод, который возвращает список в обратном порядке
    public static List<Integer> swap(List<Integer> myList) {
        List<Integer> invertList = new ArrayList<>();
        for (int i = myList.size() - 1; i >= 0; i--) {
            invertList.add(myList.get(i));
        }
        return invertList;
    }

    // 14. Даны два списка. Объедините их в один, не добавляя повторы
    public static void unionLists(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> resultList = new ArrayList<Integer>();
        resultList.addAll(listOne);
        for (Integer num : listTwo) {
            if (!listOne.contains(num)) {
                resultList.add(num);
            }
        }
        System.out.println("Объединенный лист:" + resultList);
    }

    // 15. Считайте List<Integer> и посчитайте сумму только нечётных чисел
    public static int sumOdd(List<Integer> list) {
        int sumOdd = 0;
        for (int z : list) {
            if (z % 2 != 0) {
                sumOdd = sumOdd + z;
            }
        }
        return sumOdd;
    }

    // 16. Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"
    public static List<String> foodOnA(List<String> list) {
        List<String> foodOnA = new ArrayList<String>();
        for (String j : list) {
            if (j.startsWith("А")) {
                foodOnA.add(j);
            }
        }
        return foodOnA;
    }
}