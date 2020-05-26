/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pierre-Henry Barge
 */
//Instanciation de la classe Client
public class Client {
//Déclaration des attributs

    private static int numPartage = 1;

    private int num;
    private double solde;

    private int totalArticles;
    private int totalCredits;
    private double limiteCredit;
//Création d'un constructeur

    public Client() {
        //Incrémentation de num client à chaque création d'un client
        num = numPartage++;
    }
//Déclaration de la méthode saisieSolde

    public void saisieSolde() {
        int chiffreInt = afficheBoiteDialoguedeSaisie("Entrer un solde");
        solde = chiffreInt;
    }
//Déclaration de la méthode saisieTotalArticles

    public void saisieTotalArticles() {
        int chiffreInt = afficheBoiteDialoguedeSaisie("Entrer un total articles");
        totalArticles = chiffreInt;
    }
//Déclaration de la méthode saisieTotalCredits    

    public void saisieTotalCredits() {
        int chiffreInt = afficheBoiteDialoguedeSaisie("Entrer un total de crédits");
        totalCredits = chiffreInt;
    }
//Déclaration de la méthode saisieLimiteCredit

    public void saisieLimiteCredit() {
        int chiffreInt = afficheBoiteDialoguedeSaisie("Entrer une limite de crédit");
        limiteCredit = chiffreInt;
    }

//Déclaration de la méthode afficheBoiteDialoguedeSaisie reprise respactivement par chaque méthodes 
//"throws HeadlessException, NumberFormatException" sert à gérer les exceptions
    private int afficheBoiteDialoguedeSaisie(String msg) throws HeadlessException, NumberFormatException {
        String chiffreString;
        chiffreString = JOptionPane.showInputDialog("Entrez un chiffre");

        //on parse 
        int chiffreInt = Integer.parseInt(chiffreString);
        return chiffreInt;
    }
//Déclaration de la méthode calculerNouveauSolde   

    public void calculerNouveauSolde() {
        //calculer le nouveau solde (solde début - débits + crédits)
        solde = (solde - totalArticles) + totalCredits;
    }

//Déclaration de la méthode afficherSolde
    public void afficherSolde() {
        if (solde > limiteCredit) {
            //Affichage d'une popup indiquant le solde
            JOptionPane.showMessageDialog(null, "Le solde est : " + solde);
            System.out.println("Le solde est : " + solde);
        } else {
            //Affichage d'une popup indiquant que vous avez dépassé la limite de votre solde
            JOptionPane.showMessageDialog(null, "Vous avez depasser votre limite credit de " + solde);

            System.out.println("Vous devez créditer");

        }
    }
//ToString généré automatiquement avec le refactor

    @Override
    public String toString() {
        return "Client{" + "num=" + num + ", solde=" + solde + ", totalArticles=" + totalArticles + ", totalCredits=" + totalCredits + ", limiteCredit=" + limiteCredit + '}';
    }

}
