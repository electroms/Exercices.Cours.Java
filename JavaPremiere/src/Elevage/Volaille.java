/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elevage;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Volaille {

    private int poids;
    private int id;
    
    

    public Volaille(int poids, int id) {
        this.poids = poids;
        this.id = id;
    }

    public void poidsVolaille(int poidsDonnee) {
        poids = poidsDonnee;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
