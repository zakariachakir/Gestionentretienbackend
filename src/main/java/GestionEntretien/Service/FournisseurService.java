/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEntretien.Service;

import GestionEntretien.Bean.Agent;
import GestionEntretien.Bean.Fournisseur;

/**
 *
 * @author lenovo
 */
public interface FournisseurService {
    public int save(Fournisseur fournisseur);
    public int update(Fournisseur fournisseur);
    public int delete(Fournisseur fournisseur);
}