public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //первую задачу не понял, но наверное это имелось ввиду?

        //Zadacha 2
        System.out.println();
        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Zadacha 3
        System.out.println();
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);


    }
}