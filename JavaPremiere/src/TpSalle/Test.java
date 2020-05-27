/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSalle;

import java.util.List;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Test {

    public static void main(String[] args) {

        Salle salle1 = new Salle("salle1", "info");
        Salle salle2 = new Salle("salle2", "market");
        Salle salle3 = new Salle("salle3", "reunion");
        Salle salle4 = new Salle("salle4", "serveur");
        Salle salle5 = new Salle("salle5", "administration");

        SalleService s = new SalleService();
        s.create(salle1);
        s.create(salle2);
        s.create(salle3);
        s.create(salle4);
        s.create(salle5);

        List<Salle> salles = s.findAll();

        for (Salle salle : salles) {
            System.out.println(salle);
        }

        s.delete(salle1);

        for (Salle salle : salles) {
            System.out.println(salle);
        }

        salle2.setLibelle("cours");

        s.update(salle2);

        for (Salle salle : salles) {
            System.out.println(salle);
        }

        s.save();

        s.delete(salle5);
        s.delete(salle4);

        for (Salle salle : salles) {
            System.out.println(salle);
        }

        s.restore();

        for (Salle salle : salles) {
            System.out.println(salle);
        }
    }
}
