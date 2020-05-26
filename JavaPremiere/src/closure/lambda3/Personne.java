package closure.lambda3;

public class Personne {

    private final String nom;
    private final Genre genre;
    private final int age;

    public Personne(String pNom, Genre pGenre, int pAge) {
        nom = pNom;
        genre = pGenre;
        age = pAge;

    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public Genre getGenre() {
        return genre;
    }

    public String toString() {
        return String.format("%s -- %s -- %d", nom, genre, age);
    }

}
