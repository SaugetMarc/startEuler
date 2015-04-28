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
public class ProjectEuler6 {
    
    public static Integer sommeCarre(int nb)
    {
        Integer res = 0;
        for (int i = 1; i <=nb; i++){
            res += i*i;
        }
        
        return res;
    }
    
    
    public static Integer carreSomme(int nb)
    {
        Integer res = 0;
        
        for (int i = 1; i <=nb; i++){
            res +=i;
        }
        
        return res*res;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Integer nb = 100;
        
        Integer sommeC = sommeCarre(nb);
        System.out.println(sommeC);
        
        Integer cSomme = carreSomme(nb);
        
        
        System.out.println(cSomme +" - " + sommeC +"="+  (cSomme-sommeC));
    }
    
}
