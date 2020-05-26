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
public class Poulet extends Volaille {

    private double prixPoulet;
    private double poidsAbbatPoulet;
    
    public static double PRIXKG;
    public static double POIDSABBAT;

    public Poulet(int poids, int id) {
        super(poids, id);
    }

    public void poidsAbbatagePoulet(int nouveauPoids) {
        poidsAbbatPoulet = nouveauPoids;
    }

    /**
     * @return the prixPoulet
     */
    public double getPrixPoulet() {
        return prixPoulet;
    }

    /**
     * @param prixPoulet the prixPoulet to set
     */
    public void setPrixPoulet(double prixPoulet) {
        this.prixPoulet = prixPoulet;
    }

    /**
     * @return the poidsAbbatPoulet
     */
    public double getPoidsAbbatPoulet() {
        return poidsAbbatPoulet;
    }

    /**
     * @param poidsAbbatPoulet the poidsAbbatPoulet to set
     */
    public void setPoidsAbbatPoulet(double poidsAbbatPoulet) {
        this.poidsAbbatPoulet = poidsAbbatPoulet;
    }

}
