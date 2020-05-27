/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpSalle;

import java.util.List;

/**
 *
 * @author Pierre-Henry Barge
 */
public interface IDao {

    public boolean create(Salle o);

    public boolean delete(Salle o);

    public boolean update(Salle o);

    public Salle salleFind(int id);

    public List<Salle> findAll();
}
