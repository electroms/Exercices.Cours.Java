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
public class CompteBancaire extends Exception {

    private double solde = 0.0; // solde du compte
    private double decouvert = -700.; // découvert autorisé

    public void retrait(double montant) {
        double nouveau = solde - montant;

        if (montant < 0.0) {
            throw new IllegalArgumentException("Mauvais montant");
        } else if (nouveau < decouvert) {
            System.out.println("Operation impossible : le compte serait trop debiteur");
        } else {
            solde = nouveau;
        }
    }

    @Override
    public String toString() {
        return "CompteBancaire{" + "solde=" + solde + ", decouvert=" + decouvert + '}';
    }

}
