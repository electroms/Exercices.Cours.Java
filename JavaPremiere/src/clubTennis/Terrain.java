/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubTennis;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Terrain {

    private int numero;
    private String ville;
    private String arbitre;

    public Terrain(int numero, String ville, String arbitre) {
        this.numero = numero;
        this.ville = ville;
        this.arbitre = arbitre;
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

    public String getArbitre() {
        return arbitre;
    }

    public void setArbitre(String arbitre) {
        this.arbitre = arbitre;
    }

    @Override
    public String toString() {
        return "Terrain{" + "numero=" + numero + ", ville=" + ville + ", arbitre=" + arbitre + '}';
    }

}
