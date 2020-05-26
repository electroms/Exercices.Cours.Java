/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closure.lambda1;

/**
 *
 * @author Lucien Martos
 */
interface Instrument1 {                                   // 1. Interface 

    void jouer();
}

//class Saxophone implements Instrument{		   // 2. Implementation 
//	public void jouer() {
//		System.out.println("SAX SAX SAX...");
//	}
//}
public class Main1 {					   // 3. Démonstration 

    public static void main(String[] args) {
        Instrument1 instrument1;			   // Declaration
        instrument1 = new Instrument1()                    // Instanciation   
        {
            @Override
            public void jouer() {
                System.out.println("SAX SAX SAX...");
            }
        };
        instrument1.jouer();				    // Utilisation 
    }
}
