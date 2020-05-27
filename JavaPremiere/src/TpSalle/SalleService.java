/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSalle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pierre-Henry Barge
 */
public class SalleService implements IDao {

    public List<Salle> liste = new ArrayList<>();

    @Override
    public boolean create(Salle o) {
        liste.add(o);
        return true;
    }

    @Override
    public boolean delete(Salle o) {
        liste.remove(o);
        return true;
    }

    @Override
    public boolean update(Salle o) {
        int i = 0;
        i = liste.indexOf(o);
        if (i == -1) {
            return false;
        } else {
            liste.set(i, o);
            return true;
        }
    }

    /**
     * Méthode qui fait une recherche de salle en lui passant en parametre un
     * identifiant
     *
     * @param id de type entier
     * @return salle si elle est trouvée sinon null
     */
    @Override
    public Salle salleFind(int id) {

        for (Salle o : liste) {
            if (o.getId() == id) {
                return o;

            }
        }

        return null;
    }

    @Override
    public List<Salle> findAll() {
        return liste;
    }

    public void save() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\Pierre-Henry Barge\\Documents\\test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Salle o : liste) {
                bw.write(o.getId() + ";" + o.getCode()
                        + ";" + o.getLibelle()
                );
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            System.out.println("Erreur" + e);
        }finally{
            try {
                fw.close();
            }catch (Exception e) {
                System.out.println("Erreur " + e);
            }
        }
    }

    public void restore() {
        try {
            FileReader fr = new FileReader("C:\\Users\\Pierre-Henry Barge\\Documents\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            liste.clear();
            while (br.ready()) {
                String ligne = br.readLine();
                String[] p = ligne.split(";");
                Salle s = new Salle(Integer.parseInt(p[0]),p[1],p[2]);
                liste.add(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Erreur " + e);
        }
    }
}
