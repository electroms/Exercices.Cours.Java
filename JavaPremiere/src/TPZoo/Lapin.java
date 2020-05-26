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
public class Lapin extends Animal {

    public Lapin(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("ronge");

    }

}
