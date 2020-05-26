/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 *
 * @author lucien
 */
public class Cercle extends Forme {
    private int rayon;
    
    public Cercle(){
        rayon = 10;
    }
    
    public double circonference(){
        return (2 * Math.PI * rayon);
    }
    
    @Override
    public double surface(){
        return Math.PI * rayon * rayon;
    }
}
