/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.test;

/**
 *
 * @author sauget
 */
public class ProjectEurler1 {

    /**
     * @param args the command line arguments
     */
    public static boolean estMultipleDeCinq(Integer nb) {
        return (nb % 5 == 0);
    }

    public static boolean estMultipleDeTrois(Integer nb) {
        return (nb % 3 == 0);
    }

    public static void main(String[] args) {
        int borneMax = 1000;
        Integer somme = 0;
        for (int i = 0; i < borneMax; i++) {
            if (estMultipleDeTrois(i) || estMultipleDeCinq(i)) {
                somme += i;
            }
        }
        
        System.out.println("borne Max : " + borneMax + " Somme + "  + somme );

    }

}
