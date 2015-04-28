/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.test;

import java.util.ArrayList;

/**
 *
 * @author sauget marc
 */
public class ProjectEuler5 {

    private static ArrayList<Integer> listeMultiple;

    /* Vérifie si un nombre est divisible par les nombre allant de 1 à 20 inclu*/
    public static boolean estDivisible(Integer nb) {

        boolean estDivisible = true;

        for (int i = 1; i <= 20 && estDivisible; i++) {
            if (nb % i != 0) {

                return false;
            }
        }

        return true;
    }

    
    public static void forceBrute()
    {
         boolean estDivisible = false;

        int nb = 20;
        while (!estDivisible) {
            nb++;
            estDivisible = estDivisible(nb);
        }

        System.out.println("nb " + nb);
    
    }
    
    
    
    /**
     * Calcul le plus petit diviseur commun d'un nombre et fusionne le resultat avec 
     * la liste globale des plus petit diviseur commun.
     **/
    public static void diviseurPremier(Integer nb) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < 21; i++) {
            res.add(0);
        }

        int p = 2;

        while (p <= nb) {
            if (nb % p == 0) {
                res.set(p, res.get(p) + 1);
                nb = nb / p;
            } else {
                p++;
            }
        }

        // fusion des listes
        for (int i = 0; i < 21; i++) {
            if (res.get(i) > listeMultiple.get(i)) {
                listeMultiple.set(i, res.get(i));
            }
        }
    }

    
    
     /**
      * Methode utilisant la fusion des 20 premiers diviseurs communs 
      * pour calculer le nombre souhaité.
      */
     public static  void calculPlusPetitDiviseurCommun(){
          listeMultiple = new ArrayList<>();

        for (int i = 0; i < 21; i++) {
            listeMultiple.add(0);
        }

        for (int i = 0; i<= 20; i ++){
            
            diviseurPremier(i);
            
        }
        

        
        Integer resultat = 1;
        for (int i = 0; i < 21; i++) {
            if (listeMultiple.get(i) > 0) {
                for(int j = 0; j < listeMultiple.get(i); j++){
                    System.out.print(i +" ");
                    resultat *=i;
                }
            }
        }
        
        System.out.println(" = " + resultat);
    }
    
    public static void main(String[] args) {

           
      forceBrute();
      calculPlusPetitDiviseurCommun();
    }

}
