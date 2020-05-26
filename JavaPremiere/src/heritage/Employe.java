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
public class Employe extends Personne {

    //attribut caracteristique specialise d'une personne pour devenir Employe
    private float salaire;      // ...  

    public Employe(){
        super();
       setNom("TITI");
        
    }
    public Employe(String nom, Date dn) {
        super(nom, dn);
    }

    
    
    /**
     * 
     * @return 
     */
    public float getSalaire() {
        return salaire;
    }

    /**
     * 
     * @param salaire 
     */
    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString()+"Employe{" + "salaire=" + salaire + '}';
    }
    
    
    
}
