/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapremiere;

/**
 * Premiere instanciation de la class Point et utilisation des methodes de Point
 * Utilisation du constructeur par defaut suivi d'un constructeur avec parametre
 *
 * @author Pierre-Henry Barge
 */
public class Main {

    public static void main1(String[] args) {
        Point p = null;
        p = new Point();
        p.setX(10);
        p.setY(12);
        System.out.println(p.distance());
        Point p1 = new Point(10, 12);
        Point p2 = new Point();
        System.out.println("Point constructeur vide valeur par defaut de x " + p2.getX() + " de y " + p2.getY());
    }

    //**************************passage par valeur et par référence************************
    public void passageValeur(int x) {
        x = x + 10;
    }

    public void appelPassageValeur() {
        int y = 20;
        passageValeur(y);
        System.out.println("valeur de y " + y);
    }

    public void passageReference(Point p) {
        p.setX(10);
    }

    /**
     * main exemple pour passage valeur passage reference
     *
     * @param args
     */
    public static void main2(String[] args) {
        Main m = new Main();
        m.appelPassageValeur();

        Point p1 = new Point(5, 10);
        m.passageReference(p1);

        System.out.println("Valeur de l'attribut de x du point passé : " + p1.getX());
    }

    //***************************************************************************************
    /**
     * main pour static
     *
     * @param args
     */
    public static void main(String[] args) {

        Chat[] chats = new Chat[10];
        Main.initialiserTableauChat(chats);

        Chat chef = leaderChat(chats);
        System.out.println("Affichage du chef des chats");
        //System.out.println(chef);
        Main.afficherTableauChat(chats);
        System.out.println("Affichage du chef a partir de l'indice");
        //afficher le chef
        int index = chats[((int) Math.random() * 10)].getIndexChefEntier();
        System.out.println(chats[index]);
        chats[((int) Math.random() * 10)].affichageChef();
    }

    //*****************************************************************************************
    //utilisation du mot cle static sur une methode :
    //si elle est public elle sera accessible par toutes clases en la prefixant du nom de la classe dans laquelle elle se trouve : Main.initialiserTableauChat
    /**
     * methode de classe initialisation du tableau avec 10 instances de Chat
     * valeur parametres farfelus
     *
     * @param chats
     */
    private static void initialiserTableauChat(Chat[] chats) {
        for (int i = 0; i < 10; i++) {
            Chat c = new Chat("couleur" + i, 10 + i, "taille" + i);
            chats[i] = c;

        }
    }

    /**
     * affichage sur la console les chats du tableau Chat
     *
     * @param chats
     */
    private static void afficherTableauChat(Chat[] chats) {
        for (Chat c : chats) {
            System.out.println(c);
        }
    }

    private static Chat leaderChat(Chat[] chats) {
        double alea = Math.random();
        double indice = alea * 10;
        int indiceT = (int) indice;
        Chat c = chats[indiceT];
        c.setIndexChef(true);
        //information de chaque chats de l'indice du chef
        for (Chat chat : chats) {
            chat.setIndexChefEntier(indiceT);
        }

        //attribuer la charge de chef directement sur l'attribut static chef
        Chat.chef = c;
        return c;
    }
}
