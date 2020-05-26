/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciceFormation;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Main {

    public static void main(String[] args) {

        Employe employe1;
        Employe employe2;
        Manager manager1;

        employe1 = new Employe(1, "Dupond", "Jacques");
        employe2 = new Employe(2, "Durand", "Patrick");
        manager1 = new Manager(3, "Rabbit", "Jacob");

        demandeFormation df1 = employe1.demandeFormation("Hibernate");
        demandeFormation df2 = employe2.demandeFormation("UML");

        manager1.valideFormation(df1, demandeFormation.ACCORDE);
        System.out.println(df1.getEtatValidation());
        System.out.println(df1);
        manager1.valideFormation(df2, demandeFormation.REFUS);

    }
}
