/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamda.formation.etape1;

/**
 *
 * @author lucien
 */
interface Instrument {                                          // 1. Interface 

    void jouer();
}

//Etape 1 On crée la classe Musicien et on l'instancie
class Musicien{
    void performance(Instrument instrument){
        System.out.println("Le Musicien joue Satisfation !");
        instrument.jouer();
    }
}
public class Lanceur {
    public static void main(String[] args) {
        Musicien musicien = new Musicien();
        
    }
}
