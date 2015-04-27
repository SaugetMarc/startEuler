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
public class ProjectEuler4 {

    public static boolean estPalindrome(Integer nb) {
        Boolean res = false;

        String temp = nb.toString();

        int split = temp.length() / 2;


        String start = temp.substring(0, split);

        String end = temp.substring(temp.length() - split, temp.length());

        String den = new StringBuilder(end).reverse().toString();


        return den.equals(start);
    }

    public static void main(String[] args) {

               
        int max=0, max1=0, max2= 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99 ; j--) {
                
                int nb = i *j; 
                if (estPalindrome(nb)){
                 
                    if (nb > max ){
                           System.out.println(nb + " = " + i +"x"+j);
                        max = nb;
                        max1 = i; 
                        max2=j;
                    }
                }
            }
        }
        
        System.out.println(max +"="+ max1 +"*"+  max2);

       

    }

}
