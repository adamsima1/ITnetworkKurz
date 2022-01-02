package com.itnetwork;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Zadejte levou mez 1. intervalu:");
        int levaMez1 = Integer.parseInt(console.nextLine());
        System.out.println("Zadejte pravou mez 1. intervalu:");
        int pravaMez1 = Integer.parseInt(console.nextLine());
        System.out.println("Zadejte levou mez 2. intervalu:");
        int levaMez2 = Integer.parseInt(console.nextLine());
        System.out.println("Zadejte pravou mez 2. intervalu:");
        int pravaMez2 = Integer.parseInt(console.nextLine());

        System.out.println("Dvojice čísel, jejichž součet leží v některém z intervalů:");
        System.out.println("(1. číslo je z prvního intervalu a 2. z druhého intervalu)");
        int soucet;

        for (int i = levaMez1; i <= pravaMez1; i++){

            for (int j = levaMez2;j<=pravaMez2;j++){
                soucet = i+j;

                if (((soucet<=pravaMez1 && soucet >= pravaMez1)) || ((soucet <= pravaMez1) && (soucet >= levaMez1))){

                    System.out.printf("[%d;%d]" + " " ,i,j);

                }





            }
        }






            }
        }




















