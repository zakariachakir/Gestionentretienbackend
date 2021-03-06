/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEntretien.Service;

import GestionEntretien.Bean.Reclamation;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ReclamationService {

    public List<Reclamation> findAll();
    public List<Reclamation> findByReclamentName(String reclament);
    public int save(Reclamation reclamation, String username);

    public int reclamationSeen(String reference);

    public int update(Reclamation reclamation);
    public int delete (String refernce);
    public List<Reclamation> findReclamationsNonTraiter();
}
