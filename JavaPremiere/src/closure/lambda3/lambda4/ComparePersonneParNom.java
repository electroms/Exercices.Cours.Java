package closure.lambda3.lambda4;

import closure.lambda3.Personne;
import java.util.Comparator;



public class ComparePersonneParNom implements Comparator<Personne> {

	@Override
	public int compare(Personne p1, Personne p2) {
		return p1.getNom().compareTo(p2.getNom()); // Négatif si Nom p1 avant Nom p2 dans lexique. 0 si meme nom
	}

}
