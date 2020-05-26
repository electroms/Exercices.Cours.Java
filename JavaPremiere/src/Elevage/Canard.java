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
public class Canard extends Volaille {

    private double prixCanard;
    private double poidsAbbatCanard;

    public static double PRIXKG;
    public static double POIDSABBAT;

    public Canard(int poids, int id) {
        super(poids, id);
    }

    public void poidsAbbatageCanard(int nouveauPoids) {
        poidsAbbatCanard = nouveauPoids;
    }

    /**
     * @return the prixCanard
     */
    public double getPrixCanard() {
        return prixCanard;
    }

    /**
     * @param prixCanard the prixCanard to set
     */
    public void setPrixCanard(double prixCanard) {
        this.prixCanard = prixCanard;
    }

    /**
     * @return the poidsAbbatCanard
     */
    public double getPoidsAbbatCanard() {
        return poidsAbbatCanard;
    }

    /**
     * @param poidsAbbatCanard the poidsAbbatCanard to set
     */
    public void setPoidsAbbatCanard(double poidsAbbatCanard) {
        this.poidsAbbatCanard = poidsAbbatCanard;
    }

}
