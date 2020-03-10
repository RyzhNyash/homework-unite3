package by.ld.unit3.main;

import java.util.Scanner;

public class TaskCurrencyConverter {
    public static void main(String[] args) {


        //        Scanner inData = new Scanner(System.in);
        String type1 = inputType1(); //во что конвертируем
        String type2 = inputType2(); //что конвертируем
        double sumIn = sumIn1();
        double sumOut = 0;
        System.out.println("__________");

        //        курс и виды валюты
        String rubS = "1";
        String dolS = "2";
        String dolC = "3";
        String eurS = "4";

        double rubRu = 1; //значения относительно рубля
        double dolUs = 0.015;
        double dolCa = 0.02;
        double eurEs = 0.013;

        //        конвертер
        if ((type1 == rubS) & (type2 == dolS)) {
            sumOut = sumIn * dolUs;
            System.out.println(sumIn + " российских рублей = " + sumOut + " $ ");
        } else if ((type1 == rubS) & (type2 == dolC)) {
            sumOut = sumIn * dolCa;
            System.out.println(sumIn + " российских рублей = " + sumOut + " канадских долларов");
        } else if ((type1 == rubS) & (type2 == eurS)) {
            sumOut = sumIn * eurEs;
            System.out.println(sumIn + " российских рублей = " + sumOut + " евро ");
        } else if ((type1 == dolC) & (type2 == rubS)) {
            sumOut = sumIn / dolUs;
            System.out.println(sumIn + " $ = " + sumOut + "российским рублям ");
        } else if ((type1 == dolC) & (type2 == rubS)) {
            sumOut = sumIn * dolCa;
            System.out.println(sumIn + " канадских долларов = " + sumOut + "российским рублей ");
        } else if ((type1 == eurS) & (type2 == rubS)) {
            sumOut = sumIn / eurEs;
            System.out.println(sumIn + " евро " + sumOut + " российским рублям ");
        } else {
            System.out.println("что то в логике твоей не верно");
        }

        for (int i = 1; i < 10; i++) {
            double test = type1.length();
            System.out.println(test);
        }

        //        вывод

        System.out.println(type1);
        System.out.println(type2);

//__________декомпозиция !!!
    }

    private static String inputType1() {

        Scanner inData = new Scanner(System.in);

        System.out.println("В какую валюту конвертировать, введите цифру: ");
        System.out.println("1 - Рубли Россия");
        System.out.println("2 - Доллары США");
        System.out.println("3 - Доллары Канада");
        System.out.println("4 - Евро");
        System.out.print(">  ");

        String type1 = inData.nextLine();
        System.out.println(type1);
        return (type1);
    }

    private static String inputType2() {

        Scanner inData = new Scanner(System.in);

        System.out.println("Из какуй валюты конвертировать, введите цифру: ");
        System.out.println("1 - Рубли Россия");
        System.out.println("2 - Доллары США");
        System.out.println("3 - Доллары Канада");
        System.out.println("4 - Евро");
        System.out.print(">  ");

        String type2 = inData.nextLine();
        System.out.println(type2);
        return (type2);
    }

    private static double sumIn1() {
        double sumIn1 = 0;
        Scanner inData = new Scanner(System.in);
        System.out.print("Сумма в исходной валюте >  ");
        sumIn1 = inData.nextDouble();
        return (sumIn1);
    }
}
