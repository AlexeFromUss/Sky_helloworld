

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        int integer = 10;
        String integerCh = "integer";
        byte varByte = 3;
        String varByteCh = "varByte";
        short shortInteger = 300;
        String shortIntegerCh = "shortInteger";
        long longInteger = 100500L;
        String longIntegerCh = "longInteger";
        float notInteger = 3.5f;
        String notIntegerCh = "notInteger";
        double bigNotInteger = 300.12345678;
        String bigNotIntegerCh = "bigNotInteger";

        System.out.println("Значение переменной " + integerCh + " с типом int равно " + integer);
        System.out.println("Значение переменной " + varByteCh + " с типом byte равно " + varByte);
        System.out.println("Значение переменной " + shortIntegerCh + " с типом short равно " + shortInteger);
        System.out.println("Значение переменной " + longIntegerCh + " с типом long равно " + longInteger);
        System.out.println("Значение переменной " + notIntegerCh + " с типом float равно " + notInteger);
        System.out.println("Значение переменной " + bigNotIntegerCh + " с типом double равно " + bigNotInteger);

        //Zadacha 2
        float firts = 27.12f;
        long second = 987678965549L;
        String third = "2,786";
        //String был выбран, только потому, что в уроке говорилось, что дробная часть числа может быть отделена ТОЛЬКО точкой. Иначе был бы float
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;

        //Zadacha 3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short allPaper = 480;
        int sheetsPerPupil = allPaper / (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");

        //Zadacha 4
        byte efficiency = 16;
        byte efficiencyTime = 2;
        int efficiencyPerMinute = efficiency / efficiencyTime;
        System.out.println("За 20 минут машина произвела " + (efficiencyPerMinute * 20) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (efficiencyPerMinute * 60 * 24) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (efficiencyPerMinute * 60 * 24 * 3) + " штук бутылок");
        System.out.println("За месяц (30 дней) машина произвела " + (efficiencyPerMinute * 60 * 24 * 30) + " штук бутылок");

        //Zadacha 5
        byte bankas = 120;
        byte whitePerClass = 2;
        byte brounePerClass = 4;
        int classes = bankas / (whitePerClass + brounePerClass);
        int allWhite = classes * whitePerClass;
        int allBroune = classes * brounePerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhite +" банок белой краски и " + allBroune + " банок коричневой краски");


        //Zadacha 6
        byte banans = 5;
        byte bananMass = 80;
        short milk = 200; //мл
        byte milkMass = 105; //гр
        byte icecream = 2;
        byte icecreamMass = 100;
        byte yayca = 4;
        byte yaycaMass = 70;

        int zavtrakGramm = (banans * bananMass) + (milk * milkMass) + (icecream * icecreamMass) + (yayca * yaycaMass);
        float zavtrakKilo = (float) zavtrakGramm / 1000;
        System.out.println("Рецепт спортсмена на завтрак весит " + zavtrakGramm + " грамм.");
        System.out.println("Рецепт спортсмена на завтрак весит " + zavtrakKilo + " килограмм.");
        if (zavtrakKilo > 1) System.out.println("Тренер готовит \"кабанчика\" на убой");

        //Zadacha 7
        byte otelsya = 7; //кг
        short racionOne = 250; //грамм
        short racionTwo = 500; //грамм
        short dayOnRacionOne = (short) ((otelsya * 1000) / racionOne);
        short dayOnRacionTwo = (short) ((otelsya * 1000) / racionTwo);
        int dayOnRacionAverage = (otelsya * 1000) / ((racionOne + racionTwo) / 2);
        System.out.println("В худщем случае похудение может занять " + dayOnRacionOne + " дней");
        System.out.println("В лучшем случае похудение может занять " + dayOnRacionTwo + " дней");
        System.out.println("В среднем похудение занимает " + dayOnRacionAverage + " дней");

        //Zadacha 8
        int mashaBase = 67760;
        int denisBase = 83690;
        int kristinaBase = 76230;

        int mashaNew = mashaBase + (mashaBase / 10);
        int denisNew = denisBase + (denisBase / 10);
        //int kristinaNew = kristinaBase * 1.1; могло бы быть так, но не хочу появления double в этой части кода
        int kristinaNew = kristinaBase + (kristinaBase / 10);

        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + ((mashaNew * 12) - (mashaBase * 12)) +" рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + ((denisNew * 12) - (denisBase * 12)) +" рублей");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + ((kristinaNew * 12) - (kristinaBase * 12)) +" рублей");



    }
}