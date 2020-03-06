package by.ld.unit03.main;

import java.util.Scanner;

public class TaskCurrencyConverter {
    public static void main(String[] args) {


        //        Scanner inData = new Scanner(System.in);
        String type1 = inputType1();
        String type2 = inputType2();
        double sumIn = sumIn1();

        //        курс и виды валюты
        String rubS = "1";
        String dolS = "2";
        String docS = "3";
        String eurS = "4";

        double rubRu = 1; //значения относительно рубля
        double dolUs = 0.015;
        double dolCa = 0.02;
        double eurEs = 0.013;

        //        конвертер


        //        вывод

        System.out.println(type1);
        System.out.println(type2);
        System.out.println(sumIn);

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
