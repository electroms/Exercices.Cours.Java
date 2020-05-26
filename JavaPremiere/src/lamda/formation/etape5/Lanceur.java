/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamda.formation.etape5;

//exemple pour la methode default d'une interface
// Suposer que vous souhaitiez ajouter une nouvelle methode à Intrument
// on ajoute accorder que se passe t il ? Pourquoi

//pour eviter de modifier le code on aimerait avoir un comportement par defaut

interface Instrument {       // 1. Interface 
    //si on avait un objet de type String en retour 
    String jouer();
    
    //void accorder();
    
    
    default void accorderInstrument(){
        System.out.println("Maintenant je joue juste");
    }
}

//Etape 2 On appele la méthode performance en passant un instrument
class Musicien{
    void performance(Instrument instrument){
        System.out.println("Le Musicien joue Satisfation !");
        instrument.jouer();
        instrument.accorderInstrument();
        //maintenant ce sera plus juste
        instrument.jouer();
    }
}
public class Lanceur {
    public static void main(String[] args) {
        Musicien musicien = new Musicien();
        //avec une expression Lamda :
        musicien.performance(()->"Super");
        //equivalent a 
        musicien.performance(()->{
                System.out.println("YE YE YE");
                return "Super";
        });
    }
}
