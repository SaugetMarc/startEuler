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
public class ProjectEuler2 {

    public static void main(String[] args) {

        int t1 = 1;
        int t2 = 2;
        int t3 = 0;

        int somme = t2;
        

        while (t3 <= 4000000) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            if (t3 % 2 == 0) {
                somme += t3;
            }
        }

        System.out.println(somme);

    }

}
