import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



/**
 * DZ_3
 */
public class DZ_3 {

    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Вашему вниманию представлена домашняя работа по теме:");
        System.out.println("'Коллекции JAVA: Введение'");
        System.out.println("Задача №1:");
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него четные числа.");
        System.out.println("Задача №2:");
        System.out.println("Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max().");
        System.out.println("");
        
        task1();
        task2();
    }
    private static void task1() {
        System.out.println("Задача №1:");
        List<Integer> integers = new ArrayList();
        List<String> stringers = new ArrayList();
        Random r = new Random();
        int lowerBound = 10;
        int upperBound = 100;
        int result = 0;
        int tempo = 0;
        String temp = "";
// Заполняю целочисленный список
        for (int index = 0; index < upperBound; index++) { 
            result = r.nextInt(upperBound-lowerBound) + lowerBound;
            integers.add(result);
        }
        System.out.println("Начальный список:");
        System.out.println(integers);
// Заменяю четные элементы нулями
        result = 0;
        for (int index = 0; index < upperBound; index++) {
            if (integers.get(index)%2 == 0) {
                integers.set(index, 0);
                result++;
            }
        }
// Заполняю строковый споисок значениями целочисленного
        for (int index = 0; index < upperBound; index++) {
            tempo = integers.get(index);
            temp = "";
            temp = "" + tempo;
            stringers.add(index, temp);
        }
// Удаляю из строкового списка нули
        for (int i = 0; i < result; i++) {
            stringers.remove("0");
        }
// Очищаю целочисленный список
        integers.clear();
// Заполняю целочисленный список
        for (int index = 0; index < stringers.size(); index++) {
            result = Integer.parseInt(stringers.get(index));
            integers.add(result);
        }
        System.out.println("Конечный список");
        System.out.println(integers);
    }
    private static void task2() {
        System.out.println("");
        System.out.println("Задача №2:");
        List<Integer> integers = new ArrayList();
        Random r = new Random();
        int lowerBound = 10;
        int upperBound = 100;
        int result = 0;

// Заполняю целочисленный список
        for (int index = 0; index < upperBound; index++) { 
            result = r.nextInt(upperBound-lowerBound) + lowerBound;
            integers.add(result);
        }
        System.out.println("Начальный список:");
        System.out.println(integers);
        Integer max = Collections.max(integers);
        System.out.println("Максимальный элемент списка: " + max);
        Integer min = Collections.min(integers);
        System.out.println("Минимальный элемент списка: " + min);
        double sum = 0;
        for (int x: integers) {
        sum += x;
        }
            System.out.print("Среднее арифметическое чисел: " + sum/integers.size());
    }
}

