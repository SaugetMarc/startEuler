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
public class ProjectEurler9 {

    public static void main(String[] args) {
        
        boolean trouve = false;

        for (int i = 0; i < 500 && !trouve; i++) {
            for (int j = 0; j < 500 && j < i && !trouve; j++) {
                Double cT = Math.sqrt(i * i + j * j);
                int c = cT.intValue();
                if (c + i + j == 1000) {
                    // parce que la racine n'est pas toujours entière ...
                    if (c * c == (i * i + j * j)) {
                        System.out.println(i + " " + j + " " + c);
                        System.out.println(i * j * c);
                        System.out.println(i + j + c);
                        
                        trouve = true;
                    }
                }
            }
        }


    }

}
