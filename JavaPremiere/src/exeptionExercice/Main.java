/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeptionExercice;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Main {
    public static void main(String[] args) {
        CompteBancaire c = new CompteBancaire();
        System.out.println(c);
        
        try{
            c.retrait(-10);
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    
}
