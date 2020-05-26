/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritageExercice;

import java.util.Date;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Vente extends Employe {
    
    private double chiffreAffaireVente;
    private int remunerationVente = 400;
    private double salaireVente;

    public Vente(String nom, String prenom, int age, Date date_entree) {
        super(nom, prenom, age, date_entree);
    }
    
    
    public double calculerSalaire() {
         return salaireVente = (chiffreAffaireVente * 0.2 + 400);
    }
    
}
