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
public class ProjectEuler7 {
    
       public static void main(String[] args)
    {
        
        int compteur = 1;
        int nb = 3;
        
        while (compteur <10001 ){
            
            if (Tools.estPremier(nb))
            {
                compteur++;
            }
            nb +=2;
        }
        
        System.out.println(nb -2);
  
    }
    
}
