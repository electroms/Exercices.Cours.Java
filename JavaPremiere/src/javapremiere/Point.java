/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapremiere;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Point {

//*********************Attributs de classe************************
    private double x; // abscisse du point
    private double y; // ordonnée du point
    private double z; // hateur du point

    //*******************Constructeur******************************
    //l'utilisateion du constructeur implicite ! pas de constructeur déclaré
    //Utilisation d'un constructeur avec passage de parametre => mascage du constructeur implicite obligation de créer explicitement le constructeur
    /**
     * Constructeur explicite pour utilisation dans le main
     */
    public Point() {

    }

    /**
     * Constructeur de Point avec passage de parametres x, y
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this(x, y);
        this.z = z;
    }
//**********************Methodes***********************************
// translate de point de (dx,dy)

    public void translate(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }
// calcule la distance du point à l’origine

    double distance() {
        double resultat = Math.sqrt(x * x + y * y);
        return resultat;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(double z) {
        this.z = z;
    }

}
