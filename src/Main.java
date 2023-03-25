import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        // Исправления ДЗ
        //в критериях по task1 указано, что вывод в консоль должен осуществляться каждый месяц,
        // в коде сейчас выводится только финальный результат:
        System.out.println("Задача 1");
        int total = 0;
        int monht = 0;
        int monhtVznos = 15_000;
        while (total <= 2_460_000) {
            monht++;
            total = total + monhtVznos;
            System.out.println("« Месяц " + monht + " , сумма накоплений равна " + total + " рублей »");
        }
        // System.out.println("« Месяц " + monht +" , сумма накоплений равна "+ total +" рублей »");  исправления ДЗ
    }

    public static void task2() {
        //в цикле for инициализируется переменная i,
        // но вводится еще одна переменная forNumber, которая используется для вывода значения,
        // это некорректное применение.
        //исправлнено ДЭ
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.print(" Вывод в обратном порядке с помощью for ");
        System.out.println();
        byte whileNumber = 1;
        while (whileNumber <= 10) {
            System.out.print(whileNumber + " ");
            whileNumber++;
        }
        System.out.print(" Вывод от 1 до 10 с помощью while ");
        System.out.println();
    }

    public static void task3() {
        //в задаче 3 значение (bornVolume-deathVolume)/1000.0
        // вычисляется на каждой итерации цикла, хотя оно константное,
        // более оптимально было бы рассчитать один раз до запуска цикла;
        //исправление ДЗ
        System.out.println("Задача 3");
        double people = 12_000_000;
        int deathVolume = 8;
        int bornVolume = 17;
        double ratioPeople = (bornVolume - deathVolume) / 1000.0;
        int year = 0;
        while (year < 10) {
            double eachYear = ratioPeople * people;
            people = people + eachYear;
            System.out.printf("%.2f \n", people);
            year++;
        }
    }

    public static void task4() {
        //нужно поработать над неймингом, воспользуйся переводчиком
        System.out.println("Задача 4");
        double summa = 15_000;
        int totalSumma = 12_000_000;
        float ratioMonht = 7f;// в процентах
        while (summa < totalSumma) {
            summa = summa + summa * (ratioMonht / 100);
            System.out.printf("%.2f \n", summa);
        }
    }

    public static void task5() {
        //нужно поработать над неймингом, воспользуйся переводчиком
        System.out.println("Задача 5");
        double summa = 15_000;
        int totalSumma = 12_000_000;
        float ratioMonht = 7f;// в процентах
        for (int monht = 1; summa < totalSumma; monht++) {
            summa = summa + summa * (ratioMonht / 100);
            if (monht % 6 == 0) {
                System.out.printf(" номер месяца " + monht + " %.2f \n ", summa);
            }
        }
    }

    public static void task6() {
        //нужно поработать над неймингом, воспользуйся переводчиком
        System.out.println("Задача 6");
        double summa = 15_000;
        int totalSumma = 12_000_000;
        int year = 108;//в месяцах
        float ratioMonht = 7f;// в процентах
        for (int monht = 0; monht < year; monht++) {
            summa = summa + summa * (ratioMonht / 100);
            if (monht % 6 == 0) {
                System.out.printf(" номер месяца " + monht + " %.2f \n ", summa);
            }
        }

    }

    public static void task7() {
        //нужно поработать над неймингом, воспользуйся переводчиком
        System.out.println("Задача 7");
        byte firstFriday = 5;
        byte totalDayMonht = 31;
        for (int i = firstFriday; i < totalDayMonht; i = i + 7) {
            System.out.println("Сегодня " + i + " число, пятница. Нужно сдавать отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int lowerBound = currentYear - 200;
        int highBound = currentYear + 100;
        for (int i = 0; i <= highBound; i = i + 79) {
            if (i > lowerBound && i < highBound) {
                System.out.println(i);
            }
        }
    }
}








