package Kapitel2;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 2019-09-17
 */

public class IKlassen17September {

    // Vi snakker om metodernes parametre & signatures
    // Input --> Gøre noget --> Output

    // Programmering er et superkreativt fag!

    // Klassernes opbygning

    public static void main(String[] args) {


        // Vi ser på eksemplerne fra 2 og 3 kapitel i bogen

        // Eksempler på constants, f.eks. final double PI = 3.14;
        final double PI = 3.1415926535897932384626433832795028841;

        // Hov, denne duer ikke:
        // PI = 3.14;

        // Lidt matematik - Potens --> Math.pow(a, b)
        double a = 2;
        double potens = 8;
        double resultat = Math.pow(a, potens);
        System.out.println(resultat);

        // Lidt matematik - Modulus
        int x = 25;
        int y = 7;
        resultat = x % y;
        System.out.println(resultat);

        // Notation af binær og hexadecimal tal
        // 0b - binær
        // 0x - hex
        // 5_6_7
        System.out.println(100_000_000);

        // Systemtid
        // System.currenttimeMillis()
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365+1970);

        // Static methods kaldes direkte på klassen! Mærkeligt...
        Bil bila = new Bil();
        Bil.dyt();
        Bil.dyt();
        Bil.dyt();

        // Static members generelt
        // Også variabler kan være static

        // Selections


        /* ------------------------------- */

        // Metoder — vise call stack

        // Reading input from console

        // Vi udvikler følgende 2 metoder:
        // double bmi(højde, vægt)
        // String hello(navn)
        // Vi snakker om method signature
    }






}