/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPZoo;

/**
 *
 * @author Pierre-Henry Barge
 */
public abstract class Animal {

    private String nom;

    public Animal(String nom) {
        this.nom = nom;

    }

    public abstract void manger();

    public String getNom() {
        char[] tc = nom.toCharArray();
        String nomModifie = this.getClass().getSimpleName() + " ";
        for (int i = 0; i < tc.length; i++) {
            char c = tc[i];
            if (i % 2 == 0) {
                nomModifie = nomModifie + (Character.toString(c)).toUpperCase();

            } else {
                nomModifie = nomModifie + (Character.toString(c)).toLowerCase();
            }

        }
        return nomModifie;
    }

    public String getNom1() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" ");
        char[] tc = nom.toCharArray();
        for (int i = 0; i < tc.length; i++) {
            String c = Character.toString(tc[i]);
            if (i % 2 == 0) {
                c = c.toUpperCase();
            } else {
                c = c.toLowerCase();
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
