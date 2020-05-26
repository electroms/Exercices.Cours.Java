/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapremiere;

import java.util.Locale;

/**
 *
 * @author lucien
 *
 */
public class JavaPremiere {

    int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        System.out.println("Hello Java, Bienvenue !!!");
        System.out.println("sout + tab");
        System.out.println("sout + tab");
        //declaration affectation de types primitifs avec operateurs et ==
        int m = 7;
        double d = 34.00D;
        float f = 66.00F;
        short s = 6;
        int is = s;
        int mini = 8;
        short sminiint = (short) mini;
        int n = 7;
        int a = 2 * ++m; //a vaut 16, m vaut 8
        System.out.println("a " + a + " m " + m);
        int b = 2 * n++; //b vaut 14, n vaut 8

        System.out.println("b " + b + " n " + n);

        //mots reserves conditionnelles et boucles
        if (5 == 5) {
            System.out.println("5 = 5");
        } else if (true) {
            System.out.println("Bizarre ???");
        }

        int mystere = (b > n) ? b : n;
        System.out.println("Mystere " + mystere);

        System.out.println("**************************");
        char c = '2';

        switch (c) {
            case 'a': {
                System.out.println("a");
                break;
            }
            case '2': {
                System.out.println("2");
                break;
            }
            default: {
                System.out.println("Default");
            }
        }
        System.out.println("***************************************");
        int test = 0;

        for (int i = 0; i < 10; test = i++) {
            System.out.println("Bonjour " + test + "i " + i);
        }
        int i = 0;
        test = 0;
        //test = i++;
        //System.out.println(test);
        while (i < 10) {
            System.out.println("Bonjour " + test + "i " + i);
            test = i++;
            System.out.println(test);
        }
        System.out.println("***Do While***************");
        i = 0;
        do {
            System.out.println("i " + (i++));
        } while (i < 10);

    }

    public static void main2(String[] args) {
        //tableaux 
        int tab[] = new int[4];
        int[] tab2;

        tab[0] = 1;
        tab[1] = 2;

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        //String
        String s = "Bonjour";
        String s1 = new String(" JAVA");
        String s3 = s + s1;
        System.out.println(s3);
        String c0 = "Test";
        String c1 = "Test";
        String c2 = new String("Test");
        System.out.println(c0 == c1);
        System.out.println(c0 == c2);
        System.out.println(c2.equals(c0));
        c0 = c0 + "1";
        System.out.println(c1);
    }

    public static void main(String[] args) {
        //exercice
        String p = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class";

        System.out.println("*1 Mettre la chaine en Majscule*************************************************");
        System.out.println("1 : " + p.toUpperCase());

        System.out.println("*Extraire les 10 premieres lettres et les mettre en minuscule*************************************************");
        System.out.println("2 : " + p.substring(0, 11).toLowerCase());

        System.out.println("*3 A l'aide de la methode split vous afficherez tous les mots de la phrase*************************************************");
        String[] t = p.split(" ");
        System.out.println("3 :");
//avec boucle for classique
//        for(int i = 0; i< t.length; i++){
//            System.out.println(t[i]);
//        }
//boucle foreach
        for (String s : t) {
            System.out.println(s);
        }

        System.out.println("*4 Chaque mot devra avoir la premier letre en Majuscule*************************************************");
        System.out.println("4 : ");
        for (int i = 0; i < t.length; i++) {
            String premiereLettre = t[i].substring(0, 1).toUpperCase();
            String suivantes = t[i].substring(1).toLowerCase();
            System.out.println(premiereLettre + suivantes);
        }
    }

    public static void main4(String[] args) {
        String s = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class";
        String[] mots = s.split(" ");
        for (String mot : mots) {
            System.out.println(String.valueOf(mot.charAt(0)).toUpperCase());
        }
    }
}
