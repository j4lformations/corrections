package com.j4ltechnologies.formation.java.exo01;

import java.util.Scanner;

/**
 * Classe Question400, créée le 06/08/2021 à 15:28
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question400 {
    public static void main(String[] args) {
        /*
         * Lire 10 nombres et trouver le plus grand.
         */
        Scanner scanner = new Scanner(System.in);

        double max = Double.NEGATIVE_INFINITY;

        try {
            for (int i = 1; i < 11; i++) {
                System.out.print("N" + i + " = ");
                double saise = scanner.nextDouble();
                max = Math.max(max, saise);
            }
            System.out.printf("\nMax = %s%n", max);
        } catch (Exception e) {
            System.out.println("Attention à votre saisie, Des nombres sont attendus en saisie");
        }
    }
}
