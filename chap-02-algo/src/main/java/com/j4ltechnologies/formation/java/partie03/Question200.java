package com.j4ltechnologies.formation.java.partie03;

import com.j4ltechnologies.formation.java.J4lUtils;

import java.util.Arrays;

/**
 * Classe Question200, créée le 09/08/2021 à 14:18
 *
 * @author Joachim Zadi
 * @version 1.0
 */
public class Question200 {
    //Inverser les éléments d'un tableau de 10 éléments
    public static void main(String[] args) {
        long[] tableau = J4lUtils.tabAleatoireEntier(16);
        System.out.println(Arrays.toString(tableau));
        int longueur = tableau.length;
        for (int i = 0; i < longueur / 2; i++) {
            long temp = tableau[i];
            tableau[i] = tableau[longueur - i - 1];
            tableau[tableau.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(tableau));
    }
}
