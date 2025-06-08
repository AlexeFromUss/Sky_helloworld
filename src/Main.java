

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        int age = 9;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        //Zadacha 2
        int outdoorAirTemperature = 180;
        if (outdoorAirTemperature < 5) {
            System.out.println("На улице " + outdoorAirTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outdoorAirTemperature + " градусов, можно идти без шапки");
        }

        //Zadacha 3
        int speed = 300;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
        }

        //Zadacha 4
        int ageOfThePerson = 25;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад.");
        }
        if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу.");
        }
        if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университет.");
        }
        if (ageOfThePerson > 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу :.(");
        }

        //Zadacha 5
        int childrenAge = 14;
        if (childrenAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childrenAge > 5 && childrenAge < 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childrenAge > 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        if (childrenAge == 5 || childrenAge == 14) {
            System.out.println("Ребунку не может быть " + childrenAge + " лет. В условиях задачи об этом не упоминалось!");
        }

        //Zadacha 6
        int sitSpace = 60;
        int carriageCapacity = 102;
        int ticketNumber = 6132;
        if (ticketNumber <= sitSpace) {
            System.out.println("Ваше место в вагоне на комфортабельном кресле № " + ticketNumber);
        } else {
            if (ticketNumber > sitSpace && ticketNumber <= carriageCapacity) {
                System.out.println("Стоячее место вагона");
            } else {
                System.out.println("Вас обманули! В вагоне не осталось свободных мест.");
            }
        }

        //Zadacha 7
        int one = 7;
        int two = 8;
        int three = 8;


        if (one > two && one > three) {
            System.out.println("Наибольнее число находится в переменной one и равно " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Наибольшее число находится в переменной two и равно " + two);
            } else if (three > one && three > two) {
                System.out.println("Наибольшее число находится в переменной three и равно " + three);
            } else {
                if (one == two && one > three) {
                    System.out.println("Наибольшее число находится в переменных one и two и равно " + one);
                } else {
                    if (one == three && one > two) {
                        System.out.println("Наибольшее число находится в переменных one и three и равно " + one);
                    } else {
                        if (three == two && three > one) {
                            System.out.println("Наибольшее число находится в переменных two и three и равно " + three);
                        } else {
                            if (one == two && one == three && three == two) {
                                System.out.println("Все числа равны.");
                            }
                        }
                    }
                }
            }
        }


    }
}