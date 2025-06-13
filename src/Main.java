

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        int savings = 0;
        int month = 0;
        while (savings < 2_459_000) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
            month++;
            savings += 15000;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");

        //Zadacha 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Zadacha 3
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate =8;
        int  year = 1;
        while (year <= 10) {
            population += ((birthRate - mortalityRate) * (population / 1000));
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }

        //Zadacha 4
        int savingsInBank = 15000;
        month = 1;
        while (savingsInBank < 12_000_000) {
            //savingsInBank = savingsInBank * 1.07; требуется изменить тип переменной на double
            savingsInBank += (savingsInBank / 100 * 7); // не требуется изменения типа. Разница по памяти 32bit, т.е. 2 раза
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savingsInBank + " рублей.");
            month++;
        }

        //Zadacha 5
        savingsInBank = 15000;
        month = 1;
        while (savingsInBank < 12_000_000) {
            savingsInBank += (savingsInBank / 100 * 7);
            if (month % 6 == 0) {System.out.println("Месяц " + month + ", сумма накоплений равна " + savingsInBank + " рублей.");}
            month++;
        }


        //Zadacha 6
        savingsInBank = 15000;
        month = 1;
        while (month <= (12 * 9)) {
            savingsInBank +=  (savingsInBank / 100 * 7);
            if (month % 6 == 0) {System.out.println("Месяц " + month + ", сумма накоплений равна " + savingsInBank + " рублей.");}
            month++;
        }

        //Zadacha 7
        int friday = 4; // указываем число первой пятницы
        while (friday <= 31) { // в нашем месяце строго 31 день
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет" );
            friday = friday + 7;
        }

        //Zadacha 8
        int thisYear = 2025;
        int lastTwoHundredYears = thisYear - 200;
        int nextHundredYears = thisYear + 100;
        int checkYear = 0; //комета пролетает каждый 79-й год, *начиная с нулевого*.
        while (checkYear <= nextHundredYears) { //делаю через while потому, что это тема урока. удобнее было бы использовать for
            if (checkYear >= lastTwoHundredYears) {
                System.out.println(checkYear);
            }
            checkYear += 79;
        }









    }
}