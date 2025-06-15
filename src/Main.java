import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Zadacha 1
        int [] arrayOne = new int [3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        double [] arrayTwo = {1.57, 7.654, 9.986};
        short [] adress = {192, 168, 1, 1};

        //Zadacha 2
        for (int i = 0; i < arrayOne.length-1; i++) {
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.println(arrayOne[2]);
        for (int i = 0; i < arrayTwo.length-1; i++) {
            System.out.print(arrayTwo[i] + ", ");
        }
        System.out.println(arrayTwo[2]);
        //Т.к. в задаче не указано каким именно циклом пользоваться попробую while
        int j = 0;
        while (j < adress.length-1) {
            System.out.print(adress[j] + ",");
            j++;
        }
        System.out.println(adress[j]);

        //Zadacha 3
        for (int i = arrayOne.length-1; i > 0; i--) {
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.println(arrayOne[0]);
        for (int i = arrayTwo.length-1; i > 0; i--) {
            System.out.print(arrayTwo[i] + ", ");
        }
        System.out.println(arrayTwo[0]);
        //Т.к. в задаче не указано каким именно циклом пользоваться попробую while
        j = adress.length-1;
        while (j > 0) {
            System.out.print(adress[j] + ",");
            j--;
        }
        System.out.println(adress[j]);

        //Zadacha 4
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));



    }
}