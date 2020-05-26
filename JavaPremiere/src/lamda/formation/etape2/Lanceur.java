/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamda.formation.etape2;

/**
 *
 * @author lucien
 */
/**
 *
 * @author lucien
 */
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
        //musicien.performance(instrument);
        //pour ne pas avoir une erreur 
        //avant java 8
        // 1 il faut avoir soit une classe qui implémente l'interface : Guitare
        Guitare gibson = new Guitare();
        musicien.performance(gibson);
        
        // 2 soit créer une classe anonyme interne
        musicien.performance(new Instrument() {
            @Override
            public void jouer() {
                System.out.println("YE YE YE");
            }
        });
        
        //on remarque que pour la ligne 42 on est obliger d'écrire de 37 à 44
        
    }
}

//nous devons redefinir la methode de l'interface
class Guitare implements Instrument{

    @Override
    public void jouer() {
        System.out.println("I Can't Get No");
    }
    
}
