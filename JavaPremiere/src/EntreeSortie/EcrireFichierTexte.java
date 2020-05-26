/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntreeSortie;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Pierre-Henry Barge
 */
public class EcrireFichierTexte {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("C:\\Users\\Pierre-Henry Barge\\Documents\\essai.txt");
         BufferedWriter bw= new BufferedWriter(fw);
         bw.write("Ceci est mon fichier");
         bw.newLine();
         bw.write("Il est à moi...");
         bw.close();
        } catch (Exception e) {
            System.out.println("Erreur"+e); 
        }
    }
}
