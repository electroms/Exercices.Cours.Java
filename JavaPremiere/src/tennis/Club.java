/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucien
 */
public class Club {
    private List<Terrain> terrains;
    private List<Joueur> joueurs;

    public Club() {
        terrains = new ArrayList<>();
        joueurs = new ArrayList<>();
    }
    
    public void ajoutTerrain(Terrain t){
        terrains.add(t);
    }
    
    public void supprimerTerrain(Terrain t){
        terrains.remove(t);
    }
    
    public void ajoutJoueur(Joueur j){
        joueurs.add(j);
    }
    
    public void supprimeJoueur(Joueur j){
        joueurs.remove(j);
    }

    public List<Terrain> getTerrains() {
        return terrains;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }
    
}
