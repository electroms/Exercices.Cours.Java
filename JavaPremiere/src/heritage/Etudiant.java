/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.Date;

/**
 *
 * @author lucien
 */
public class Etudiant extends Personne {
    private int numero_carte_etudiant;  

    public Etudiant(String nom, Date dn) {
        super(nom, dn);
    }

    public int getNumero_carte_etudiant() {
        return numero_carte_etudiant;
    }

    public void setNumero_carte_etudiant(int numero_carte_etudiant) {
        this.numero_carte_etudiant = numero_carte_etudiant;
    }

    @Override
    public String toString() {
        return super.toString()+"Etudiant{" + "numero_carte_etudiant=" + numero_carte_etudiant + '}';
    }
    
    
    
}
