/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapremiere;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Chat {

    //*********************Attributs************************
    private String couleur;
    private double poids;
    private String taille;
    //problèmatique du chef : on passe par un boolean
    private boolean indexChef = false;
    //problèmatique du chef : on passe par un entier qui donne l'info et donne l'info de l'index du chef
    private int indexChefEntier;

    //problemetique resolu avec l'usage d'un attribut de type Chat
    //ici nous avons une variable de classe et non d'instance
    //on peut acceder directement sans instancier un chat : Chat.chef
    //la valeur esr partage d'office par l'ensemble des instances de Chat
    public static Chat chef;

    //********************************************************
    //methode qui donne le chef pour utiliser le chef static
    public void affichageChef() {
        System.out.println(chef);
    }

    //**********************Constructeur**********************
    /**
     * constructeur d'instance de Chat
     *
     * @param c couleur
     * @param p poids
     * @param t taille
     */
    public Chat(String c, double p, String t) {
        couleur = c;
        this.poids = p;
        this.taille = t;

    }

    //***********************Get / Set*************************
    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * @return the taille
     */
    public String getTaille() {
        return taille;
    }

    /**
     * @param taille the taille to set
     */
    public void setTaille(String taille) {
        this.taille = taille;
    }

    /**
     * @return the indexChef
     */
    public boolean isIndexChef() {
        return indexChef;
    }

    /**
     * @param indexChef the indexChef to set
     */
    public void setIndexChef(boolean indexChef) {
        this.indexChef = indexChef;
    }

    /**
     * @return the indexChefEntier
     */
    public int getIndexChefEntier() {
        return indexChefEntier;
    }

    /**
     * @param indexChefEntier the indexChefEntier to set
     */
    public void setIndexChefEntier(int indexChefEntier) {
        this.indexChefEntier = indexChefEntier;
    }

    @Override
    public String toString() {
        return "Chat{" + "couleur=" + couleur + ", poids=" + poids + ", taille=" + taille + " est chef ? " + indexChef + '}';
    }
}
