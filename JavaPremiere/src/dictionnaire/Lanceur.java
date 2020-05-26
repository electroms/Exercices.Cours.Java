/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionnaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Lanceur {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            liste.add("Chaine" + i);
        }

        //concept du Map 
        String a1 = "A";
        String a2 = "Alors";
        String a3 = "Autrefois";
        List<String> lA = new ArrayList<>();
        lA.add(a3);
        lA.add(a1);
        lA.add(a2);

        String b1 = "Bebe";
        String b2 = "Bord";
        List<String> lB = new ArrayList<>();
        lB.add(b2);
        lB.add(b1);
        /*
        Key       Valeur
        "A"          {"A", "Alors", "Autrefois"}
        "B"           ....
         */

        Map<String, List<String>> m;
        m = new HashMap<>();

        //m = new TreeMap<>(); si on souhaite que les cles soient triées
        m.put("A", lA);
        List<String> lT = new ArrayList<String>();
        lT.addAll(lA);
        Collections.sort(lT);
        m.put("ATrie", lT);
        m.put("B", lB);
        //afficher les valeurs
        //1 recuperer les Keys
        Set<String> s = m.keySet();
        //2 parcourir le SET pour recuperer la liste respective à la key
        for (String key : s) {
            List<String> l = m.get(key);
            System.out.println(key);
            //3 parcourir la liste pour afficher les mots
            for (String chaine : l) {
                System.out.println("\t" + chaine);
            }
        }
    }
}
