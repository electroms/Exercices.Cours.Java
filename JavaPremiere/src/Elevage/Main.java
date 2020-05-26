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
public class Main {

    public static void main(String[] args) {
        Volaille poulet1;
        Volaille canard1;

        Poulet.PRIXKG = 10;
        Canard.PRIXKG = 10;
        Poulet.POIDSABBAT = 20;
        Canard.POIDSABBAT = 20;

        poulet1 = new Volaille(5, 1);
        canard1 = new Volaille(4, 1);

        System.out.println("Le poids d'un poulet est de " + poulet1.getPoids() + " KG");
        System.out.println("Le poids d'un canard est de " + canard1.getPoids() + " KG");
        System.out.println("Le poids au Kg d'un poulet est " + Poulet.PRIXKG + " KG");
        System.out.println("Le poids au Kg d'un canard est " + Canard.PRIXKG + " KG");
        System.out.println("Le poids d'abbatage d'un poulet est " + Poulet.POIDSABBAT + " KG");
        System.out.println("Le poids d'abbatage d'un canard est " + Canard.POIDSABBAT + " KG");

    }

}
