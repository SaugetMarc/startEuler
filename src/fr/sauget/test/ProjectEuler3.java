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
public class ProjectEuler3 {

    private static boolean estPremier(int n) {
        boolean res = false;

        if (n == 1) {
            res = true;
        } else if (n == 2) {
            res = false;
        } else {
            if (n % 2 == 0) {
                res = true;
            }
            int i = 3;
            while (i < Math.sqrt(n) && !res) {

                if (n % i == 0) {
                    res = true;
                }
                i += 2;
            }
        }
        return !res;
    }

    public static void main(String[] args) {

        Double cible = Double.valueOf("600851475143");
                
        Integer start = (int) Math.sqrt(cible);
        boolean trouve = false;
        while (!trouve)
        {
            if (estPremier(start))
            {
                if (cible % start == 0){
                    trouve = true;
                }
            }
            start -=1;
        }
        
        System.out.println(start+1);
    }

}
