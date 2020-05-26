/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPZoo;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Main {

    public static void main(String[] args) {
        Animal[] animaux = new Animal[15];
        animaux[0] = new Lion("LionClemence");
        animaux[1] = new Lion("LionJosephine");
        animaux[2] = new Lion("LionArthur");
        animaux[3] = new Lion("LionPierre");
        animaux[4] = new Lion("LionJoseph");

        animaux[5] = new Lapin("LapinClemence");
        animaux[6] = new Lapin("LapinJosephine");
        animaux[7] = new Lapin("LapinArthur");
        animaux[8] = new Lapin("LapinPierre");
        animaux[9] = new Lapin("LapinJoseph");

        animaux[10] = new Zebre("ZebreClemence");
        animaux[11] = new Zebre("ZebreJosephine");
        animaux[12] = new Zebre("ZebreArthur");
        animaux[13] = new Zebre("ZebrePierre");
        animaux[14] = new Zebre("ZebreJoseph");

        for (Animal a : animaux) {
            System.out.print(a.getNom());
            System.out.print(" : ");
            a.manger();
        }
    }
}
