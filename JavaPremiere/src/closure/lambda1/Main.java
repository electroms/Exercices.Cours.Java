/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closure.lambda1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Lucien Martos
 */
interface Instrument {                        // 1. Interface 

    void jouer();
}

class Saxophone implements Instrument {		   // 2. Implementation 
    @Override
    public void jouer() {
        System.out.println("SAX SAX SAX...");
    }
}

class Bambou implements Instrument {

    @Override
    public void jouer() {
        System.out.println("BOM BOM sur des bambous");
    }

}

public class Main {

    public static void main(String[] args) {
        Instrument instrument1;
        Instrument instrument2;// Declaration
        instrument1 = new Saxophone();			// Instanciation
        instrument2 = new Bambou();
        instrument1.jouer();
        instrument2.jouer();// Utilisation 

        //utilisation d'un inner Class
        Instrument bouteille;
        bouteille = new Instrument() {
            @Override
            public void jouer() {
                System.out.println("Je joue avec une bouteille");
            }
        };

        //ceci est utiliser dans la gestion des evenements en JAVA au niveau d'un bouton
        JButton bouton;
        bouton = new JButton("Valider");
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clic sur le bouton");
            }
        });
    }
}
