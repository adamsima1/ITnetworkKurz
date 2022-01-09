package com.itnetwork;

import java.text.MessageFormat;
import java.util.Scanner;

public class VignerovaSifra {
    public static void main(String[] args) {
        String text;
        String heslo;
        String nove_heslo = "";
        String nove_slovo = "";

        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Vítejte ve Vigenerově šifře\nZadejte slovo, které"
                + "chcete zašifrovat");

        text = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte heslo");
        heslo = sc.nextLine();

        if (heslo.length() < text.length())
            for (int i = 0; i < (text.length()) - (heslo.length()); i++)
            {
                nove_heslo += nove_heslo.charAt(i);
            }

            char[] atext = text.toCharArray();
            char[] anove_heslo = nove_heslo.toCharArray();



        }


    }






