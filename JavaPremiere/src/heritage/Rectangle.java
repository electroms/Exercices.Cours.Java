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
public class Rectangle extends Forme{
    private int longueur;
    private int largeur;
    
    public Rectangle(){
        longueur = 20;
        largeur = 10;
    }

    public Rectangle(int longueur) {
        this.longueur = longueur;
    }
    
    public Rectangle(int largeur, int longueur){
        this.largeur = largeur;
    }
    
    public int perimetre(){
        return 2* (longueur+largeur);
    }
    
    @Override
    public double surface(){
        return longueur*largeur;
    }
}
