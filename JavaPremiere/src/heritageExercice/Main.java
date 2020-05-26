/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritageExercice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Main {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = df.parse("25-12-2010");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        Employe v = new Vente("Durand", "Pierre", 40, date);
        Employe r = new Representation("Dupond", "Jean", 45, date);
        Employe p = new Production("Durant", "Alfonce", 43, date);
        Employe m = new Manutention("rabit", "Jacob", 55, date);
        
        v.calculerSalaire();
        System.out.println(v.toString());
        r.calculerSalaire();
        System.out.println(r.toString());
        p.calculerSalaire();
        System.out.println(p.toString());
        m.calculerSalaire();
        System.out.println(m.toString());
        
    }

}
