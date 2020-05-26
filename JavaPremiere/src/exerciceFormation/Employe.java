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
public class Employe {

    private int id;
    private String nom;
    private String prenom;

    public Employe(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }

    public demandeFormation demandeFormation(String theme) {
        demandeFormation formation1 = new demandeFormation(theme, "14/05/20", "10/09/20", "05/02/21");
        System.out.println("L'employé " + this.prenom + " " + this.nom + " demande une formation sur " + theme);
        return formation1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';

    }

}
