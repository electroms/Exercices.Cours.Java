/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntreeSortie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucien
 */
public class ExerciceLireEcrireFichierTexte {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        Map<String, List<String>> hm = new HashMap<>();
        try {
            String chemin = "C:\\Users\\Pierre-Henry Barge\\Documents\\javadoc.txt";
            String cheminCopy = "C:\\Users\\Pierre-Henry Barge\\Documents\\javadocM.txt";
            bw = new BufferedWriter(new FileWriter(cheminCopy));

            br = new BufferedReader(new FileReader(chemin));
            while (br.ready()) {
                String ligne = br.readLine();
                //System.out.println(ligne);
                String ligneAEcrire = majuscule(ligne, hm);
                //System.out.println(ligneAEcrire);
                bw.write(ligneAEcrire);
                bw.newLine();
            }
            bw.flush();

            //lecture de la HM
            Set<String> keys = hm.keySet();
            for (String key : keys) {
                System.out.println(key);
                for (String mot : hm.get(key)) {
                    System.out.println("\t" + mot);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExerciceLireEcrireFichierTexte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExerciceLireEcrireFichierTexte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(ExerciceLireEcrireFichierTexte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static String majuscule(String ligne, Map<String, List<String>> hm) {

        StringBuilder sb = new StringBuilder();
        if (!ligne.isEmpty()) {
            ligne = ligne.replaceAll("\t", "");
            String[] mots = ligne.split(" ");
            for (String mot : mots) {

                if (mot.length() > 0) {
                    String key = mot.substring(0, 1);
                    sb.append(key);
                    List<String> liste = hm.get(key);
                    if (liste == null) {
                        liste = new ArrayList<>();
                    }
                    liste.add(mot);
                    hm.put(key, liste);
                    if (mot.length() > 1) {
                        sb.append(mot.substring(1));
                    }
                    sb.append(" ");
                }

            }
        }

        return sb.toString();
    }

}