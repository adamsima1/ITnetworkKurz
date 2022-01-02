package com.itnetwork;

import java.text.MessageFormat;
import java.util.Scanner;

public class VignerovaSifra {
    public static void main(String[] args) {
        // Vstup pro šifrované slovo a heslo
        String text; //proměnná, do které uživatel zadá slovo, které chce šifrovat
        String heslo; //proměnná, podle které se zašifruje slovo
        String nove_heslo = ""; //heslo, které vygenerujeme ze zadaného hesla,
        //a protože jej budeme používat v cyklu, musíme jej naplnit prázdným řetězcem
        String nove_slovo = ""; //do této proměnné vygenerujeme nové slovo pomocí
        //hesla a původního slova
        Scanner sc = new Scanner(System.in, "Windows-1250");
        /* pokud zalamujete text na další řádky, použíjte operátor spojení
         * řetězce (+) buď na konci předešlého řádku za uvozovky nebo na začátku
         * nového řádku
         */
        System.out.println("Vítejte ve Vigenerově šifře\nZadejte slovo, které"
                + "chcete zašifrovat");
        /*  protože chceme šetřit řádkem, naplníme proměnnou text vstupem uživatele,
         *  rovnou odstraníme bílé znaky před a za textem a rovnou zmenšíme všehcna
         *  písmena.
         */
        text = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte heslo");
        heslo = sc.nextLine();

        //  Srovnání hesla + Generování nového slova
        /*  potřebujeme, aby heslo mělo stejný počet znaků jako slovo, proto jej
         *  srovnáme podmínkou. Mohou nastat tyto situace:
         *  heslo má více znaků než slovo
         *  heslo má stejný počet znaků jako slovo - to se pak nic nestane
         *  heslo má méně znaků než slovo
         *  Problém vyřeší tato podmínka
         */
        if (heslo.length() > text.length()) {
            /* pokud je heslo větší než slovo, zkrátíme jej pomocí Stringové
             * metody substring
             */
            nove_heslo = heslo.substring(0, text.length());
        } else if (heslo.length() < text.length()) {
            /* pokud je heslo menší než slovo, budeme ho opakovat dokud nebude
             *  stejně dlouhé jako slovo. Ale to musíme rozdělit na celá slova
             *  a na jednotlivé znaky. Nejdříve do
             */
            for (int i = 0; i < text.length() / heslo.length(); i++) {
                nove_heslo = MessageFormat.format("{0}{1}", nove_heslo, heslo); //do nového hesla přidáme heslo tolikrát,
                //kolikrát cyklus proběhne
            }
            for (int i = 0; i < text.length() % heslo.length(); i++) {
                nove_heslo += heslo.toCharArray()[i]; //doplnění nového hesla
                //částí starého tak, že jsme jej rozdělili na jednotlivé znaky
                //a přidali si pouze tolik, kolikrát proběhne cyklus
            }
        }

        // Generování nového slova + vypis
        /* Cyklus, který do proměnné nove_slovo vygeneruje postupně znaky kombinované
         *  původním textem a heslem
         */
        int index, index2; //pomocné proměnné, které si budou průběžně uchovávat hodnotu znaků
        for (int i = 0; i < text.length(); i++) {
            index = (int) text.toCharArray()[i]; //pomocná proměnná pro znak z textu
            index2 = (int) nove_heslo.toCharArray()[i] % 96; //pomocná proměnná pro znak z hesla
            //podmínka, která zařídí, aby se při vyšší hodnotě, než je hodnota
            //znaku 'z' začalo počítat opět od znaku 'a'
            if (index + index2 > (int) 'z') {
                //hodnota 26 představuje návrat celé abecedy až k znaku 'a' a
                //tím začíná celý počet od znova
                nove_slovo += String.valueOf((char) (index + index2 - 26));
            } else {
                nove_slovo += String.valueOf((char) (index + index2));
            }
        }
        System.out.println(nove_slovo);
    }
}
