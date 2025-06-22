public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        System.out.println("Задача 1");
        int [] zatratsWeek = {30, 50000, 6000, 4286, 5};
        int sum = 0;
        for (int j : zatratsWeek) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Zadacha 2
        System.out.println();
        System.out.println("Задача 2");
        int [] zatratsWeekTwo = {30, 50000, 6000, 4286, 5};
        int max = zatratsWeekTwo[0];
        int min = zatratsWeekTwo[0];
        for (int i = 0; i < zatratsWeekTwo.length; i++) {
            if (zatratsWeekTwo[i] > max) {
                max = zatratsWeekTwo[i];
            }
            if (zatratsWeekTwo[i] < min) {
                min = zatratsWeekTwo[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        //Zadacha 3
        System.out.println();
        System.out.println("Задача 3");
        int [] zatratsWeekTree = {30, 50000, 6000, 4286, 5};
        int maxTree = 0;
        for (int j : zatratsWeekTree) {
            maxTree += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (maxTree / zatratsWeekTree.length) + " рублей");


        //Zadacha 4
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char tempChar;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            tempChar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = tempChar;
        }
        System.out.println(reverseFullName);


    }
}