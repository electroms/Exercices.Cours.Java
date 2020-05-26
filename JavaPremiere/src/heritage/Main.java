/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.Date;


/**
 *
 * @author lucien
 */
public class Main {
    public static void main(String[] args) {
        
        Personne p = new Personne("Personne1", new Date());
        //instance d'employé a partir d'une declaration de type Employe
        Employe e = new Employe("Employé1", new Date());
        e.nom = "TOTO";
        e.setSalaire(2000F);
        //instance d'étudiant a partir d'une déclaration de type Etudiant
        Etudiant et = new Etudiant("Etudiant1", new Date());
        et.setNumero_carte_etudiant(1000);
        
        //Cas particulier un Employe est une Personne
        //declaration de type Personne pour e1
        Personne e1 = new Employe("EmployePersonne", new Date());
        //pas de visibilite doirecte de la methode setSalaire puisque e1
        //est declaré comme Personne qui ne possede pas cette methode
        //Nous sommes obligé de "CASTER" l'instance en cours en Employe
        ((Employe)e1).setSalaire(3000);
        
        Personne [] personnes = new Personne[3];
        personnes[0]=e;
        personnes[1]=et;
        personnes[2]=e1;
        
        for(Personne person : personnes){
            System.out.println(person);
            //System.out.println(person.getNom());
            if(person instanceof Employe){
                System.out.println("Employe ");
            }else{
                System.out.println("Etudiant");
            }
        }
    }

    //main pour Forme
    public static void main2(String[] args) {
        Forme r = new Rectangle();
        System.out.println("Perimetre du rectangle "+((Rectangle)r).perimetre());
        //System.out.println("Surface du rectangle "+r.surface());
        afficheSurface(r);
        Forme c = new Cercle();
        System.out.println("Circonference du cercle "+((Cercle) c).circonference());
        //System.out.println("Surface du cercle "+c.surface());
        afficheSurface(c);
    }
    
    
    public static void afficheSurface(Forme f){
        System.out.println(f.surface());
    }
}
