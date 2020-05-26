/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciceFormation;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Manager extends Employe {

    public Manager(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public void valideFormation(demandeFormation laFormation, String motif) {
        laFormation.setEtatValidation(motif);
    }

}
