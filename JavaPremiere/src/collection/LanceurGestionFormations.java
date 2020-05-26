package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class LanceurGestionFormations {

	/**
	 * Classe principale = point d'entr�e de l'application = classe possedant methode main()
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// 1) Declaration 
		Employe employe1 ;
		Employe employe2 ;
		Collection<Employe> maListeEmployes; // Declaration collection ordonnees d'Employ�s
		

		// 2) Instanciation 	
		employe1 = new Employe("DUPOND", "Michel", 1);
		employe2 = new Employe("LAMBERT", "Stephane", 2);
		maListeEmployes = new ArrayList<Employe>();

		// 3) Utilisation (Les employes et le manager demandent une formation)
		maListeEmployes.add(employe1);
		maListeEmployes.add(employe2);
                
		
		// Boucle sur la collection d'Employ�s
		for (Employe employe : maListeEmployes) {
			System.out.println(employe);
		}
                //equivalent du foreach
                Iterator<Employe> it = maListeEmployes.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
                
                //utilisation des Set
                Employe employe3 ;
		Employe employe4 ;
		employe3 = new Employe("TOTO", "Michel", 3);
		employe4 = new Employe("TATA", "Stephane", 4);
		
                maListeEmployes.add(employe3);
                maListeEmployes.add(employe4);
                
                //affichage de la collection complete
                for (Employe employe : maListeEmployes) {
			System.out.println(employe);
		}
                System.out.println("*******************************************");
                //ajout les deux employe 3 et 4
                maListeEmployes.add(employe3);
                maListeEmployes.add(employe4);
                //affichage de la collection complete
                for (Employe employe : maListeEmployes) {
			System.out.println(employe);
		}
                
                System.out.println("*******************************************");
                Set<Employe> ensembleSansDoublon = new HashSet<>(); //TreeSet ensemble ordonné
		ensembleSansDoublon.addAll(maListeEmployes);
                for (Employe employe : ensembleSansDoublon) {
			System.out.println(employe);
		}
	}
}
