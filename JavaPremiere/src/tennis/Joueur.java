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
public class Joueur extends Personne{
    
    private int classement;
    private Categorie categorie;
    
    
    public Joueur(String nom, String prenom, int age, int c) {
        super(nom, prenom, age);
        classement = c;
        categorie = donneCategorie(age);
    }

    private Categorie donneCategorie(int age) {
        if(age>49){
            return Categorie.SENIOR;
        }
        if(age>19){
            return Categorie.JUNIOR;
        }
        return Categorie.DEBUTANT;
    }

    @Override
    public String toString() {
        return super.toString()+ " Joueur{" + "classement=" + classement + ", categorie=" + categorie + '}';
    }

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
}
