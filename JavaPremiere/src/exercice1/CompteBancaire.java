/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pierre-Henry Barge
 */
public class CompteBancaire {

    //attribut de la classe 
    private double solde;

    //constructeur
    public CompteBancaire(double soldeInitial) {
        solde = soldeInitial;
    }

    //methodes
    public void crediterCompte(double montant) {
        solde = solde + montant;
        //solde += montant;
    }

    public boolean debiterCompte(double montant) {
        boolean transactionOK = false;
        if (montant <= solde) {
            solde = solde - montant;
            transactionOK = true;
        }
        return transactionOK;
    }

    public boolean debiterCompteBis(double montant){
        if (montant <= solde) {
            solde = solde - montant;
            return true;
        }
        return false;
    }

    public void afficherSolde() {
        System.out.println("Solde : " + solde);
    }

}