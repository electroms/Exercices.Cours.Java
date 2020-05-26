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
public class Production extends Employe {
    
    private int nbUnites;
    private double salaireProduction;

    public Production(String nom, String prenom, int age, Date date_entree) {
        super(nom, prenom, age, date_entree);
    }
    
    public double calculerSalaire() {
        return salaireProduction = (nbUnites * 5);
    }

    
    
}
