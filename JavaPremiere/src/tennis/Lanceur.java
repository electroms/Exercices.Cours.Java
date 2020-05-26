/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author lucien
 */
public class Lanceur {

    public static void main(String[] args) {
        //instanciation du Club
        Club monClub = new Club();

        Terrain t1 = new Terrain(0, "Lyon", new Arbitre("Pierre", "Paul", 30));
        Terrain t2 = new Terrain(1, "Lyon", new Arbitre("Pierr", "Pau", 35));
        Terrain t3 = new Terrain(2, "Lyon", new Arbitre("Pie", "Pa", 32));
        Terrain t4 = new Terrain(3, "Lyon", new Arbitre("Pierrette", "Pauline", 40));

        Terrain t5 = new Terrain(2, "Marseille", new Arbitre("Jack", "Arthur", 20));
        Terrain t6 = new Terrain(3, "Marseille", new Arbitre("Pierre", "Thierty", 24));
        Terrain t7 = new Terrain(4, "Marseille", new Arbitre("Paul", "Eloise", 30));
        Terrain t8 = new Terrain(1, "Marseille", new Arbitre("Jacques", "Anibal", 30));

        Terrain t9 = new Terrain(2, "Dijon", new Arbitre("Olivier", "Anomyme", 30));
        Terrain t10 = new Terrain(3, "Dijon", new Arbitre("Leely", "Thier", 30));
        Terrain t11 = new Terrain(4, "Dijon", new Arbitre("Genre", "Elois", 30));
        Terrain t12 = new Terrain(1, "Dijon", new Arbitre("Truc", "Aniballe", 30));

        monClub.ajoutTerrain(t1);
        monClub.ajoutTerrain(t2);
        monClub.ajoutTerrain(t3);
        monClub.ajoutTerrain(t4);
        monClub.ajoutTerrain(t5);
        monClub.ajoutTerrain(t6);
        monClub.ajoutTerrain(t7);
        monClub.ajoutTerrain(t8);
        monClub.ajoutTerrain(t9);
        monClub.ajoutTerrain(t10);
        monClub.ajoutTerrain(t11);
        monClub.ajoutTerrain(t12);

        monClub.ajoutJoueur(new Joueur("Nadal", "Paul", 15, 3));
        monClub.ajoutJoueur(new Joueur("Martinez", "Pierre", 25, 6));
        monClub.ajoutJoueur(new Joueur("El Karaz", "Mohamed", 35, 8));
        monClub.ajoutJoueur(new Joueur("Stefanini", "Hamed", 45, 2));
        monClub.ajoutJoueur(new Joueur("Le Rolle", "Maurice", 65, 1));
        monClub.ajoutJoueur(new Joueur("Tian Tyonk", "Chen", 55, 4));
        monClub.ajoutJoueur(new Joueur("Livre", "Rouge", 28, 3));
        monClub.ajoutJoueur(new Joueur("Rouge", "Clair", 32, 12));
        monClub.ajoutJoueur(new Joueur("Tahar", "Tarik", 35, 50));
        monClub.ajoutJoueur(new Joueur("Krout", "Vladimir", 18, 1));
        monClub.ajoutJoueur(new Joueur("Tahar", "Tarik", 36, 50));
        monClub.ajoutJoueur(new Joueur("Krout", "Vladimir", 17, 1));
        //affichage des joueurs
        for (Joueur j : monClub.getJoueurs()) {
            System.out.println(j);
        }
        //Vous afficherez les joueurs classés par leur nom prenom age
        //ajout de l'interface Comparable sur la classe Personne
        //compareTo algo sur le nom
        Collections.sort(monClub.getJoueurs());
        System.out.println("**************Trie par nom************************");
        for (Joueur j : monClub.getJoueurs()) {
            System.out.println(j);
        }

        //trie par age tout simplement
        Collections.sort(monClub.getJoueurs(), new Comparator<Joueur>() {
            @Override
            public int compare(Joueur o1, Joueur o2) {
                return o1.getAge() - o2.getAge();
            }

        });
        System.out.println("*************Trie par Nom Asc avec Comparator *********");
        for (Joueur j : monClub.getJoueurs()) {
            System.out.println(j);
        }
        
        
        Collections.sort(monClub.getJoueurs(), new Comparator<Joueur>() {
            @Override
            public int compare(Joueur o1, Joueur o2) {
                return o1.getNom().compareTo(o2.getNom());
            }

        });
        System.out.println("*************Trie ar Nom Asc avec Comparator *********");
        for (Joueur j : monClub.getJoueurs()) {
            System.out.println(j);
        }
        
        
        
        Collections.sort(monClub.getJoueurs(), new Comparator<Joueur>() {
            @Override
            public int compare(Joueur o1, Joueur o2) {
                int vRetour = o1.getCategorie().compareTo(o2.getCategorie());
                if(vRetour == 0){
                    vRetour = o1.getClassement() - o2.getClassement();
                }
                return vRetour;
            }

        });
        System.out.println("*************Trie ar Categorie et classement par Comparator *********");
        for (Joueur j : monClub.getJoueurs()) {
            System.out.println(j);
        }
        
        
        
        
        
        
        //trie par Arbitre des terrains
        Collections.sort(monClub.getTerrains(), new Comparator<Terrain>(){
            @Override
            public int compare(Terrain o1, Terrain o2) {
                return o1.getA().getNom().compareTo(o2.getA().getNom());
            }
            
        });
        System.out.println("*************Trie arbitre par Comparator *********");
        for (Terrain j : monClub.getTerrains()) {
            System.out.println(j);
        }
    }
}
