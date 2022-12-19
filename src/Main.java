public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
         if (clientOS == 0) {
             System.out.println("Установите версию приложения для iOS по ссылке");
         } else if (clientOS == 1) {
             System.out.println("Установите версию приложения для Android по ссылке");
         }
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int  clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay += 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("\n");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Месяц Январь - Зима");
                break;
            case 2:
                System.out.println("Месяц Февраль - Зима");
                break;
            case 3:
                System.out.println("Месяц Март - Весна");
                break;
            case 4:
                System.out.println("Месяц Апрель - Весна");
                break;
            case 5:
                System.out.println("Месяц Май - Весна");
                break;
            case 6:
                System.out.println("Месяц Июнь - Лето");
                break;
            case 7:
                System.out.println("Месяц Июль - Лето");
                break;
            case 8:
                System.out.println("Месяц Август - Лето");
                break;
            case 9:
                System.out.println("Месяц Сентябрь - Осень");
                break;
            case 10:
                System.out.println("Месяц Октябрь - Осень");
                break;
            case 11:
                System.out.println("Месяц Ноябрь - Осень");
                break;
            case 12:
                System.out.println("Месяц Декабрь - Зима");
                break;
            default:
                System.out.println("Такого меясца не существует");
        }
    }
}