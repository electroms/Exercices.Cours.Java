/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.Date;

/**
 *
 * @author lucien
 */
public class Personne {

    //attributs
    protected String nom;
    private Date date_naissance;        

    //constructeur
    public Personne(){
        
    }
    /**
     * 
     * @param nom
     * @param dn 
     */
    public Personne(String nom, Date dn){
        this.nom = nom;
        this.date_naissance = dn;
    }

    //methodes
    
    
    //accesseurs
    /**
     * 
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * 
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 
     * @return 
     */
    public Date getDate_naissance() {
        return date_naissance;
    }

    /**
     * 
     * @param date_naissance 
     */
    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", date_naissance=" + date_naissance + '}';
    }
    
    
    
}
