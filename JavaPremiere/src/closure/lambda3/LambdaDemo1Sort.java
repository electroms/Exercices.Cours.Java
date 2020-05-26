package closure.lambda3;

import java.util.Arrays;
import java.util.List;



public class LambdaDemo1Sort {
	   // BESOIN : Classer une liste de Personnes par ordre alphabetique (nom)
	public static void main(String[] args) {
		List<Personne> personnes = creerPersonnes();    // jeu de données
	   
	   System.out.println(personnes);
	   
	}
		  
	  public static List<Personne> creerPersonnes() {
		    return Arrays.asList(
			    new Personne("Sarah", Genre.FEMME, 20),
			    new Personne("Sonia", Genre.FEMME, 22),
			    new Personne("Michel", Genre.HOMME, 20),
			    new Personne("Paul", Genre.FEMME, 32),
			    new Personne("Pauline", Genre.HOMME, 32),
			    new Personne("Julien", Genre.HOMME, 2),
			    new Personne("Julien", Genre.HOMME, 72),
			    new Personne("Jacques", Genre.FEMME, 12)
			  );
		  }	  
}
