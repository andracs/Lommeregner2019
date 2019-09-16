/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 2019-09-16
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Mine fede lommeregner");

        Lommeregner lommeregner = new Lommeregner();

        System.out.println("Hvad mon 1 + 1 er? ");
        System.out.println(lommeregner.sum(1, 1));

        System.out.println("Hvad mon 5 + 5 er? ");
        System.out.println(lommeregner.sum(5, 5));

        System.out.println("Hvad mon 3 + 11 er? ");
        System.out.println(lommeregner.sum(3, 11));
    }
}
