/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.test;

import fr.sauget.test.tools.Tools;

/**
 *
 * @author sauget
 */
public class ProjectEurler10 {

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
        int start = 2000000;
        
        Long compteur = Long.valueOf(0);
        while (start > -1)
        {
            if (Tools.estPremier(start))
            {
                compteur += start;
            }
            start --;
        }
        System.out.println("compteur : " + compteur);
    }

}
