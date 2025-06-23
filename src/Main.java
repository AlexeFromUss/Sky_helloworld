public class Main {

    public static void checkYearIsVisokostniy(int year) {
        int startVisokostniyYear = 1584;
        boolean everFour = year % 4 == 0;
        boolean everHundred = year % 100 == 0;
        boolean everFourHundred = year % 400 == 0;
        if (everFourHundred && year >= startVisokostniyYear) {
            System.out.println(year + "  год — високосный год");
        } else if (everFour && !everHundred && year >= startVisokostniyYear) {
            System.out.println(year + "  год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkTypeAndAgeMobileOs(byte typeOs, int yearRelease) {
        int thisYearOld = 2015;
        if (typeOs == 0) {
            if (yearRelease < thisYearOld) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (typeOs == 1) {
            if (yearRelease < thisYearOld) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int countsDaysDelivered(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1; //целочисленный признак отсутствия доставки
        }
    }


    public static void main(String[] args) {
        //Zadacha 1
        System.out.println("Задача 1");
        int year = 2024;
        checkYearIsVisokostniy(year);

        //Zadacha 2
        System.out.println();
        System.out.println("Задача 2");
        byte typeOs = 1;
        int yearRealese = 1006;
        checkTypeAndAgeMobileOs(typeOs, yearRealese);

        //Zadacha 3
        System.out.println();
        System.out.println("Задача 3");
        int deliveryDistance =5; //дистанция доставки
        if (countsDaysDelivered(deliveryDistance) > 0) { // доставка "день-в-день" (0) отсутствует в данный момент у данного "поставщика"
            System.out.println("Потребуется дней: " + countsDaysDelivered(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }

    }
}