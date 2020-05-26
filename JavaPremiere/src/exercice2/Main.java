/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

/**
 *
 * @author Pierre-Henry Barge
 */
//Déclaration de la classe Main
public class Main {

    //Déclaration de la méthode Main
    public static void main(String[] args) {
        Client c = new Client();
        c.saisieSolde();
        c.saisieLimiteCredit();
        c.saisieTotalArticles();
        c.saisieTotalCredits();
        c.calculerNouveauSolde();
        System.out.println(c.toString());
        c.afficherSolde();

    }
}
