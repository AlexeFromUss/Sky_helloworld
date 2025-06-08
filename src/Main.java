

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
        int clientDeviceYear  = 2015;
        if (clientOS == 0 && clientDeviceYear  < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear  >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear  < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear  >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }


        //Zadacha 3
        int startVisokostniyYear = 1584;
        int year = 2100;
        boolean everFour = year % 4 == 0;
        boolean EverHundred = year % 100 == 0;
        boolean everFourHundred = year % 400 == 0;

        if (everFourHundred && year>=startVisokostniyYear) {
            System.out.println("Год высокосный");
        } else if (everFour && !EverHundred && year>=startVisokostniyYear) {
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
        byte monthNumber = 13;
        if (monthNumber > 12){
            System.out.println("Нет такого месяца (if-else)");
        } else {
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
}