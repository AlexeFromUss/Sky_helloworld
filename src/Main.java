

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Zadacha 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Zadacha 3
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //Zadacha 4
        for (int i = 10; i >=-10; i--) {
            System.out.println(i);
        }

        //Zadacha 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //Zadacha 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Zadacha 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //Zadacha 8
        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings = savings + 29000;
            System.out.println("Сумма " + month + ", сумма накоплений равна " + savings + " рублей.");
        }

        //Zadacha 9
        int savingsInBank = 0;
        for (int month = 1; month <= 12; month++) {
            savingsInBank = savingsInBank + 29000 + (savingsInBank/100);
            System.out.println("Сумма " + month + ", сумма накоплений c процентами равна " + savingsInBank + " рублей.");
        }

        //Zadacha 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+ i +"="+(2*i));
        }


    }
}