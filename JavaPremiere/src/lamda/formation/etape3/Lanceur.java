/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamda.formation.etape3;

interface Instrument {       // 1. Interface 

    void jouer();
}

//Etape 2 On appele la méthode performance en passant un instrument
class Musicien{
    void performance(Instrument instrument){
        System.out.println("Le Musicien joue Satisfation !");
        instrument.jouer();
    }
}
public class Lanceur {
    public static void main(String[] args) {
        Musicien musicien = new Musicien();
        //avec une expression Lamda :
        musicien.performance(
                ()->System.out.println("YE YE YE")
        );
        //equivalent a 
        musicien.performance(()->{
                System.out.println("YE YE YE");
                //on peut ajouter des notes
        });
    }
}
