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
public class Representation extends Employe {
    private double chiffreAffaireRepresentation;
    private int remunerationRepresentation = 800;
    private double salaireRepresentation;

    public Representation(String nom, String prenom, int age, Date date_entree) {
        super(nom, prenom, age, date_entree);
    }
    
    public double calculerSalaire() {
         return salaireRepresentation = (chiffreAffaireRepresentation * 0.2 + 800);
    } 
}
