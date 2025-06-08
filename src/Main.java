

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        byte clientOS = 0; //0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная ОС");
        }

        //Zadacha 2
        int yearOfRelease = 2014;
        if (clientOS == 0) {
            if (yearOfRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (yearOfRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Zadacha 3
        int startVisokostniyYear = 1584;
        int checkYear = 2384;
        int difference = checkYear - startVisokostniyYear;
        boolean everFour = difference % 4 == 0;
        boolean EverHundred = difference % 100 == 0;
        boolean everFourHundred = difference % 400 == 0;

        if (everFourHundred) {
            System.out.println("Год высокосный");
        } else if (everFour && !EverHundred) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }

        //Zadacha 4
        int deliveryDistance  = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }


        //Zadacha 5
        byte monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца не существует");
        }







    }
}