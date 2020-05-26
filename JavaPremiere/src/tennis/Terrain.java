/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

/**
 *
 * @author lucien
 */
public class Terrain {
    private int numero;
    private String ville;
    private Arbitre a;

    public Terrain(int numero, String ville, Arbitre a) {
        this.numero = numero;
        this.ville = ville;
        this.a = a;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Arbitre getA() {
        return a;
    }

    public void setA(Arbitre a) {
        this.a = a;
    }
    
}
