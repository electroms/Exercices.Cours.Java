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
public class demandeFormation {

    private String theme;
    private String dateDemande;
    private String dateDebut;
    private String dateFin;
    private String etatValidation;

    public static String REFUS = "refus";
    public static String ACCORDE = "accorde";
    public static String ATTENTE = "attente";

    public demandeFormation(String theme, String dateDemande, String dateDebut, String dateFin) {
        this.theme = theme;
        this.dateDemande = dateDemande;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.etatValidation = ATTENTE;
        
        

    }

    /**
     * @return the theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme the theme to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return the dateDemande
     */
    public String getDateDemande() {
        return dateDemande;
    }

    /**
     * @param dateDemande the dateDemande to set
     */
    public void setDateDemande(String dateDemande) {
        this.dateDemande = dateDemande;
    }

    /**
     * @return the dateDebut
     */
    public String getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the etatValidation
     */
    public String getEtatValidation() {
        return etatValidation;
    }

    /**
     * @param etatValidation the etatValidation to set
     */
    public void setEtatValidation(String etatValidation) {
        this.etatValidation = etatValidation;
    }

    /**
     * @return the REFUS
     */
    public static String getREFUS() {
        return REFUS;
    }

    /**
     * @param aREFUS the REFUS to set
     */
    public static void setREFUS(String aREFUS) {
        REFUS = aREFUS;
    }

    /**
     * @return the ACCORDE
     */
    public static String getACCORDE() {
        return ACCORDE;
    }

    /**
     * @param aACCORDE the ACCORDE to set
     */
    public static void setACCORDE(String aACCORDE) {
        ACCORDE = aACCORDE;
    }

    /**
     * @return the ATTENTE
     */
    public static String getATTENTE() {
        return ATTENTE;
    }

    /**
     * @param aATTENTE the ATTENTE to set
     */
    public static void setATTENTE(String aATTENTE) {
        ATTENTE = aATTENTE;
        
        
    }

}
