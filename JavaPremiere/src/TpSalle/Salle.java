/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSalle;

/**
 *
 * @author Pierre-Henry Barge
 */
public class Salle {

    private int id;
    private static int count = 0;
    private String code;
    private String libelle;

    public Salle(String code, String libelle) {
        id = ++count;
        this.code = code;
        this.libelle = libelle;
    }

    public Salle(int id, String code, String libelle) {
        count = id + 1;
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + ", libelle=" + libelle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salle other = (Salle) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
