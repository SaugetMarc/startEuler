/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.test;

import java.util.ArrayList;

/**
 *
 * @author sauget
 */
public class ProjectEuler5 {

    public static boolean estDivisible(Integer nb) {
        
        boolean estDivisible = true;
        
        for (int i = 1; i<=20 && estDivisible ; i++)
        {
            if (nb % i !=0){
                
                
                return false;
            }
        }
      
        return true;
    }
    
    
    
    public static ArrayList<Integer>  diviseurPremier(Integer nb)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int p = 2; 
        
        while (p<= nb)
        {
            if (nb %p == 0)
            {
                System.out.print(p+ " ");
                res.add(p);
                nb = nb/p;
            }else{
                p++;
            }
        }
        
        return res;
    }

    public static void main(String[] args) {

               
    boolean estDivisible = false;
    
    diviseurPremier(20);
    
    int nb = 20;
      while (!estDivisible)
      {
           nb++;
          estDivisible = estDivisible(nb);
      }
       
        System.out.println("nb " + nb);
    }

}
