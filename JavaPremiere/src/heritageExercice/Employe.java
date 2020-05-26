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
public abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private Date date_entree;
    
    public Employe(String nom, String prenom, int age, Date date_entree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entree = date_entree;
    }
    
    public abstract double calculerSalaire();
    
    public void getNom() {
        System.out.println("l'employé" + nom + prenom);
    }
}
