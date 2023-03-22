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
    public static void task1 () {
        System.out.println("Задача 1");
        int total  = 0;
        int monhtVznos = 15_000;
        int monht = 0;
        while (total <= 2_460_000){
            monht++;
            total=total+monhtVznos;
        }
        System.out.println("« Месяц " + monht +" , сумма накоплений равна "+ total +" рублей »");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte forNumber = 10;
        byte whileNumber = 1;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print( forNumber + " ");
            forNumber --;
        }
        System.out.println();
        while (whileNumber<= 10){
            System.out.print(whileNumber + " ");
            whileNumber++;
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        double people = 12_000_000;
        int deathVolume = 8;
        int bornVolume = 17;
        int year = 0;
        while (year < 10){
            double eachYear = (bornVolume-deathVolume)/1000.0 * people;
            people = people + eachYear;
            System.out.printf("%.2f \n", people);
            year++;
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double summa = 15_000;
        int rezyltatSumma = 12_000_000;
        float stavkaMohnt = 7f;// в процентах
        while (summa < rezyltatSumma){
            summa = summa + summa*(stavkaMohnt/100);
            System.out.printf("%.2f \n", summa);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double summa = 15_000;
        int rezyltatSumma = 12_000_000;
        float stavkaMohnt = 7f;// в процентах
        for (int monht = 1; summa < rezyltatSumma ; monht++) {
            summa = summa + summa * (stavkaMohnt / 100);
            if (monht % 6 == 0) {
                System.out.printf(" номер месяца "+monht+" %.2f \n ", summa);
            }
        }
    }
        public static void task6() {
        System.out.println("Задача 6");
            double summa = 15_000;
            int rezyltatSumma = 12_000_000;
            int year = 108;//в месяцах
            float stavkaMohnt = 7f;// в процентах
            for ( int monht = 0; monht < year  ; monht++) {
                summa = summa + summa * (stavkaMohnt / 100);
                if (monht % 6 == 0) {
                    System.out.printf(" номер месяца "+monht+" %.2f \n ", summa);
                }
            }

    }

        public static void task7() {
        System.out.println("Задача 7");
        byte firstFriday = 5;
        byte totalDayMonht = 31;
            for (int i = firstFriday; i < totalDayMonht ; i= i+7) {
                System.out.println("Сегодня " + i + " число, пятница. Нужно сдавать отчет");
            }
    }
    public static void task8() {
        System.out.println("Задача 8");
        Scanner scanner = new Scanner(System.in);
        int tekYear = scanner.nextInt();
       // int tekYear = 2023;
        int nizGranitca = tekYear - 200;
        int verxGranitca = tekYear + 100;
        for (int year = 0; year < verxGranitca; year = year + 79) {
            if (year >= nizGranitca && year <= verxGranitca){
                System.out.println(" Год появления кометы "+ year);
            }
        }

    }

}