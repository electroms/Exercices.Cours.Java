package closure.lambda3.lambda4;

import closure.lambda3.Genre;
import closure.lambda3.Personne;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class LambdaDemo1Sort {
	   // BESOIN : Classer une liste de Personnes par ordre alphabetique (nom)
	public static void main(String[] args) {
		List<Personne> personnes = creerPersonnes();    // jeu de donn�es
	   System.out.println(personnes);
	   
		  // Collections.sort(personnes, ???);    // Collections.sort (list<T> list, Comparator<? super T> c)
	   //PB N�1. On aimerait bien pouvoir passer la m�thode compare() 
	   // ci-dessous en second argument � Collections.sort(personnes, xxxx) 
	   // MAIS pas possible avant Java 8 ! --> on ne peut passer une fonctions en param�tre d'une m�thode 
	   // --> On DOIT cr�er classe impl�mentant interface Comparator (ici classe ComparaPersonneParNom)
	   
	   //PB N�2. On aimerait bien pouvoir passer directement la classe ComparaPersonneParNom,
	   // MAIS pas possible avant Java 8 !
	   // --> in faut instancier la classe car la m�thode sort prend une instance
	// methode connue   
	   Collections.sort(personnes, new ComparePersonneParNom());    // Comparaison AVANT Java 8
	   
	   // Mais la classe est parfois 'loin' ou n'existe pas encore...donc on passe en mode 'inline'
	   
	//nouvelle approche  
	  Collections.sort(personnes, (p1, p2) -> p1.getNom().compareTo(p2.getNom()));   // Comparaison version Java8
	   
	   System.out.println(personnes);
	   
	}
	
//	  public static int compare (Personne p1, Personne p2){
//		  return p1.getNom().compareTo(p2.getNom());
//	  }
	  
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
