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
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц  " + month + " ,сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 0;
        int i = 10;
        while (num < i) {
            num++;
            System.out.print("" + num + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print("" + i + " ");

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int years = 10;
        int year = 0;
        int birth = 17;
        int death = 8;
        while (year < years) {
            y += y * (birth - death) / 1000;
            year += 1;
            System.out.println("Год " + year + " численность населения составляет " + y);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int percent = 7;
        int total = 12000000;
        int month = 1;

        int contribution = salary + (salary * percent / 100);
        int zber = contribution;
        System.out.println("Суммы " + zber + " руб накоплений за " + month + " месяцу.");
        while (zber < total){
            zber = zber * percent / 100 + zber;
            month++;
            System.out.println("Суммы " + zber + " руб накоплений за " + month + " месяцу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int percent = 7;
        int total = 12000000;
        int month = 1;
        int contribution = salary + (salary * percent / 100);
        int zber = contribution;
        while (zber < total) {
            zber = zber * percent / 100 + zber;
            month++;
            if (month % 6 == 0) {
                System.out.println("Суммы " + zber + " руб накоплений за " + month + " месяцу.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int percent = 7;
        int years = 9;
        int year = 0;
        int month = 0;

        int contribution = salary + (salary * percent / 100);
        int zber = contribution;

        while (year < years) {
            zber = zber * percent / 100 + zber;
            month++;

            if (month % 12 == 0) {
                year++;
                System.out.println("Суммы " + zber + " руб накоплений за " + month + " месяцу.");
            } else if (month % 6 == 0) {
                System.out.println("Суммы " + zber + " руб накоплений за " + month + " месяцу.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        int dateMonth = 31;
        int dataFriday = 0;

        while (friday < dateMonth) {
            friday = 7 + friday;
            if (friday < dateMonth) {
                System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int cycleComet = 79;
        int beforComet200 = 1775;
        int afterComet100 = 2075;


        for (int cometYear = 1975; cometYear < afterComet100 ;) {
            cometYear += cycleComet;
            if (cometYear < afterComet100) {
                System.out.println(cometYear);
            }
        }
        for (int cometYear = 1975; cometYear > beforComet200 ; ){
            cometYear -= cycleComet;
            if(cometYear > beforComet200) {
                System.out.println(cometYear);
            }
        }
    }
}