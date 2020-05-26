/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closure.lambda2;

/**
 *
 * @author Lucien Martos
 */
interface Instrument {                                          // 1. Interface 
	void jouer();
}

public class Main2 {						// 2. Démonstration 
	
	public static void main(String[] args) {
		Instrument instrument1;			        // Declaration
		instrument1 = ()-> System.out.println("SAX SAX SAX...");
		instrument1.jouer();				// Utilisation 
	}
}

