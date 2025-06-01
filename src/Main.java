

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Собачек " + dog);
        System.out.println("Кошечек " + cat);
        System.out.println("Листочков " + paper);

        //Zadacha 2
        dog = dog + 4;
        cat += 4;
        paper += 4;

        //Zadacha 3
        dog = dog - 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Псов " + dog);
        System.out.println("\"Независымых\" " + cat);
        System.out.println("Мукулатуры " + paper);

        //Zadacha 4
        var friend = 19;
        System.out.println("Большая компания: " + friend + " друзей");
        friend += 2;
        System.out.println("Большая компания, стало: " + friend + " друзей");
        friend /= 7;
        System.out.println("Большая компания была: " + friend + " друзей");

        //Zadacha 5
        var frog = 3.5;
        System.out.println("Лягушек: " + frog);
        frog *= 10;
        System.out.println("Лягушек: " + frog);
        frog /= 3.5;
        System.out.println("Лягушек: " + frog);
        frog += 4;
        System.out.println("Лягушек: " + frog);

        //Zadacha 6
        var fighterOne = 78.2;
        var fighterTwo = 82.7;
        System.out.println("Общая масса бойцов: " + (fighterOne + fighterTwo));
        System.out.println("Разница в массе бойцов: " + (fighterOne - fighterTwo));

        //Zadacha 7
        var Ostatok = fighterTwo % fighterOne;
        System.out.println("Остаток от деления масс бойцов: " + (Ostatok));

        //Zadacha 8
        var allTime = 640;
        var workTime = 8;
        var quantityHuman = allTime / workTime;
        System.out.println("Всего работников в компании — " + (quantityHuman) + " человек");
        quantityHuman += 94;
        allTime = quantityHuman * workTime;
        System.out.println("Если в компании работает " + (quantityHuman) + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");





    }
}