/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.test.tools;

/**
 *
 * @author sauget
 */
public class Tools {

    public static boolean estPremier(int n) {
        boolean res = false;

        if (n == 1) {
            res = true;
        } else if (n == 2) {
            res = false;
        } else {
            if (n % 2 == 0) {
                res = true;
            } else {
                int i = 3;
                while (i <= Math.sqrt(n) && !res) {

                    if (n % i == 0) {
                        res = true;
                    }
                    i += 2;
                }
            }
        }
        return !res;
    }

}
