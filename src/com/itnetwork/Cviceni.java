package com.itnetwork;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Cviceni {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Vitejvte v kalkulacce.");
        String pokracovat = "ano";


        while (pokracovat.equals("ano")) {

            System.out.println("Zadejte prvni cislo:");
            float a = Float.parseFloat(sc.nextLine());
            System.out.println("Zadejte druhe cislo:");
            float b = Float.parseFloat(sc.nextLine());
            System.out.println("Zvolte si operaci:");
            System.out.println("1 - sčítání");
            System.out.println("2 - odčítání");
            System.out.println("3 - násobení");
            System.out.println("4 - dělení");
            int volba = Integer.parseInt(sc.nextLine());
            float vysledek = switch (volba) {
                case 1 -> a + b;
                case 2 -> a - b;
                case 3 -> a * b;
                case 4 -> a % b;
                default -> 0;
            };

            if ((volba > 0) && (volba < 5)) {
                System.out.println("Vysledek: " + vysledek);

            } else {
                System.out.println("Neplatna volba");
            }

            System.out.println("Přejete si zadat další příklad? [ano/ne]");
            pokracovat = sc.nextLine();


        }
        System.out.println("Dekuji za pouziti kalkulacky");*/




       /* int[] pole = new int[10];

        for (int i = 0; i < 10; i++) {
            pole[i] = 10 - i;
        }

        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i] + " ");
        }*/


        /*String[] zeleniny = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        int slov = 0;
        String pokracovat = "ano";

        while (pokracovat.equals("ano")) {
            System.out.println("Zadej název libovolného ovoce nebo zeleniny: ");
            String slovo = sc.nextLine().trim().toLowerCase();

            boolean nalezenoOvoce = false;
            boolean nalezenaZelenina = false;

            for (String s : ovoce) {
                if (slovo.equals(s)) {
                    System.out.println("Zadal jsi ovoce");
                    nalezenoOvoce = true;
                }
            }

            if (!nalezenoOvoce) {
                for (String s : zeleniny) {
                    if (slovo.equals(s)) {
                        System.out.println("Zadal jsi zeleninu");
                        nalezenaZelenina = true;
                    }
                }
            }

            if (!nalezenoOvoce && !nalezenaZelenina) {
                System.out.println("Tvoje slovo nemám v seznamu");
            }

            slov++;
            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            pokracovat = sc.nextLine().trim().toLowerCase();
        }

        System.out.printf("Zadal jsi %d slov", slov);*/



       /* System.out.println("ASCII Tabulka");
        for (int i = 33; i <=49;i++){
           char znak = (char)i;

            System.out.println(i + ": " + znak);


        }*/

        //PALINDROME

        /*String reverse = "";
        String pokracovat = "ano";*/

      /*  while (pokracovat.equals("ano")) {
            System.out.println("Zadej palindrom:");
            String palindrom = sc.nextLine();
            palindrom = palindrom.replace(" ", "");

            for (int i = palindrom.length() - 1; i >= 0; i--) {
                reverse += palindrom.charAt(i);

                //System.out.println(reverse);
            }

            if (palindrom.equals(reverse)) {
                System.out.println("Ano toto je palindrom!");
            } else
                System.out.println("Toto neni palindrom!");

            System.out.println("Prejete si pokracovat?ano/ne");
            pokracovat = sc.nextLine();

        }*/


        //


       /* System.out.println("Input first number:");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.println("Input second number:");
        int secondNum = Integer.parseInt(sc.nextLine());
        System.out.println("Input third number:");
        int thirdNum = Integer.parseInt(sc.nextLine());

        if ((firstNum > secondNum)&&(firstNum > thirdNum)){

            System.out.println("The greatest num is: " + firstNum);
        }

        if ((secondNum > firstNum)&&(secondNum>thirdNum)){

            System.out.println("The greatest num is: " + secondNum);
        }

        if ((thirdNum > firstNum)&&(thirdNum>secondNum)){

            System.out.println("The greatest num is: " + thirdNum);
        }*/

         /*String s = "Java Exercises!";

        System.out.println("The character at position 0 is: " +s.charAt(0));
        System.out.println("The character at position 10 is: " + s.charAt(10));*/

        /*String str =  "w3resource.com";
        System.out.println("Original String : " + str);

        int val1 = str.codePointAt(1);
        System.out.println(val1);*/

        /*System.out.println("Zadej čislo od 1 do 7: ");
        int numOfDay = Integer.parseInt(sc.nextLine());
        switch (numOfDay) {
            case 1 -> System.out.println("První den v týdnu je: Pondělí");
            case 2 -> System.out.println("Druhý den v týdnu je: Úterý");
            case 3 -> System.out.println("Třetí den v týdnu je: Středa");
            case 4 -> System.out.println("Čtvrtý den v týdnu je: Čtvrtek");
            case 5 -> System.out.println("Pátý den v týdnu je: Pátek");
            case 6 -> System.out.println("Šestý den v týdnu je: Sobota");
            case 7 -> System.out.println("Sedmý den v týdnu je: Neděle");
            default -> System.out.println("Tak si kokot nebo neumis cist?");
        }*/

        /*int number_Of_DayInMonth = 0;
        String monthName = "";
        System.out.println("Input a month Number:");
        int month = Integer.parseInt(sc.nextLine()); // uzivatel zada cislo mesice
        System.out.println("Input a year:");
        int year = Integer.parseInt(sc.nextLine()); // uzivatel zada rok

        // switch metoda diky ktere nastavime parametry mesice tj. Nazev a pocet dni
        switch (month) {
            case 1 -> {
                monthName = "January";
                number_Of_DayInMonth = 31;
            }
            case 2 -> {
                monthName = "February";
                // osetreni prestupneho roku
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DayInMonth = 29;
                } else {
                    number_Of_DayInMonth = 28;
                }
            }
            case 3 -> {
                monthName = "March";
                number_Of_DayInMonth = 31;
            }
            case 4 -> {
                monthName = "April";
                number_Of_DayInMonth = 30;
            }
            case 5 -> {
                monthName = "May";
                number_Of_DayInMonth = 31;
            }
            case 6 -> {
                monthName = "June";
                number_Of_DayInMonth = 30;
                out.println("I have a birthday!!!!");
            }
            case 7 -> {
                monthName = "July";
                number_Of_DayInMonth = 31;
            }
            case 8 -> {
                monthName = "August";
                number_Of_DayInMonth = 31;
            }
            case 9 -> {
                monthName = "September";
                number_Of_DayInMonth = 30;
            }
            case 10 -> {
                monthName = "October";
                number_Of_DayInMonth = 31;
            }
            case 11 -> {
                monthName = "November";
                number_Of_DayInMonth = 30;
            }
            case 12 -> {
                monthName = "December";
                number_Of_DayInMonth = 31;
            }


        }
        // Vypis
        System.out.println(monthName + " " + year + " has " + number_Of_DayInMonth + " days.");*/

        /*out.println("The first 10 natural numbers are:");

        for (int i = 10; i >= 0; i--) {

            out.println(i+ " ");
        }
*/


        /*out.println("Input the 5 numbers: ");

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        int num4 = Integer.parseInt(sc.nextLine());
        int num5 = Integer.parseInt(sc.nextLine());

        float sumOfNumbers = num1 + num2 + num3 + num4 + num5;

        float average = sumOfNumbers / 5;

        out.println("Sum of this numbers is : " + sumOfNumbers);
        out.println("Average of this numbers is: " + average);*/

        /*out.println("Input number of terms :");
        int terms = Integer.parseInt(sc.nextLine());

        for (int i = 1; i<=terms;i++){
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
        }*/


       /* out.println(" Input the number (Table to be calculated) : Input number of terms :");

        int terms = Integer.parseInt(sc.nextLine());

        for (int i = 0;i<=terms;i++){

            out.println(terms + " x " + i +" = " + i*terms );

        }*/


        /*System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+" "); // or print(i);

            System.out.println("");



        }*/

        /*int i,j,n,k=1;

        System.out.print("Input number of rows : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(k++);
            System.out.println("");
        }*/


        //Cykly patterny
       /* int n = 5;

        for (int i = 1; i<=n;i++){
            for (int j=1;j<=n;j++){
                out.print(" * ");
            }
            System.out.println();

        }*/

        /*int n = 5;
        for (int i = 1; i<=n;i++){
            for (int j = i; j<=n;j++){
                out.print(" * ");
            }
            out.println();
        }*/


        //ARRAYS

        /*int numbers[] ={50,60,185,996,547,125,698,555,233};
        String words[] = {"Indian","Motorka","Sloveso","Manzelka","Auto","Pomerand"};

        out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        out.println("Sorted: " + Arrays.toString(numbers));
        out.println();

        out.println(Arrays.toString(words));
        Arrays.sort(words);
        out.println("Sorted: " + Arrays.toString(words));*/



















    }


}


















