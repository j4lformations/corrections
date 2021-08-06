package com.j4ltechnologies.formation.java;

/**
 * Classe Exercice, créée le 06/08/2021 à 14:10
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Exercice {
    public static void main(String[] args) {
        // Quelles sont les valeurs des expressions suivantes ? Dans chaque ligne, supposons que :
        double x = 2.5;
        double y = -1.5;
        int m = 18;
        int n = 4;

        var resulat1 = x + n * y - (x + n) * y;
        System.out.printf("resulat1 = %s%n", resulat1);

        var resulat2 = m/n + m % n;
        System.out.printf("resulat2 = %s%n", resulat2);

        var resulat3 = 5 * x - n/5;
        System.out.printf("resulat3 = %s%n", resulat3);

        var resulat4 = 1 - (1 - (1 - (1 - (1 - n))));
        System.out.printf("resulat4 = %s%n", resulat4);

        var resulat5 = Math.sqrt(Math.sqrt(n));
        System.out.printf("resulat5 = %s%n", resulat5);
    }
}