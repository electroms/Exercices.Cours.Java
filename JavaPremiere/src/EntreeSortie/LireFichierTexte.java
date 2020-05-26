/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntreeSortie;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Pierre-Henry Barge
 */
public class LireFichierTexte {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Pierre-Henry Barge\\Documents\\NetBeansProjects\\JavaPremiere\\src\\dictionnaire\\Lanceur.java");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Erreur " + e);
        }
    }
    
}
