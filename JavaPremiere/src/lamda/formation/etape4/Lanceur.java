/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamda.formation.etape4;

interface Instrument {       // 1. Interface 
    //si on avait un objet de type String en retour 

    String jouer();

}

//Etape 2 On appele la méthode performance en passant un instrument
class Musicien {

    void performance(Instrument instrument) {
        System.out.println("Le Musicien joue Satisfation !");
        instrument.jouer();
    }
}

public class Lanceur {
    //uniquement pour l'exemple 
    public static void main(String[] args) {
        Musicien musicien = new Musicien();
        //avec une expression Lamda :
        musicien.performance(() -> "YE YE YE");
        //equivalent a 
        musicien.performance(() -> {
            System.out.println("YE YE YE");
            return "toto";
        });

    }
}
