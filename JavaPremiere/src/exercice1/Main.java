/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(100.0);
        //crediter compte de 1000;
        compte1.crediterCompte(1000.50);
        compte1.afficherSolde();
        //boolean reponse = compte1.debiterCompte(1000);
        if(compte1.debiterCompte(2000.50)){
            System.out.println("Debit authorise recuperer vos billets");
        }else{
            System.out.println("Solde insuffisant");
        }

        //System.out.println(reponse);
        //reponse = compte1.debiterCompte(200);
        //System.out.println(reponse);
        compte1.afficherSolde();
    }
}
