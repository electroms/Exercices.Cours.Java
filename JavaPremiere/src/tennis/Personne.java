/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

/**
 *
 * @author lucien
 */
public class Personne implements Comparable<Personne> {
    private String nom, prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Personne o) {
        int valRetour = 0;
        //verification sur le critere Nom
        valRetour = o.getNom().compareTo(nom);//this.nom.compareTo(o.getNom());
        if(valRetour==0){
            //nom sont identique
            //critere prenom
            valRetour = this.prenom.compareTo(o.getPrenom());
            if(valRetour==0){
                valRetour = this.age - o.getAge();
            }
        }
        return valRetour;
    }

    
    
}
