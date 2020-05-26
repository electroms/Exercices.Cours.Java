/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubTennis;

import java.util.Objects;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Joueur extends Personne {

    private Categorie categorie;
    private int classement;

    public Joueur(String nom, String prenom, int age, String categorie, int classement) {
        super(nom, prenom, age);
        
        
        this.classement = classement;
    }

    


}
