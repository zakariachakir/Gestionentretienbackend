/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEntretien.Dao;

import GestionEntretien.Bean.BonCarburant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lenovo
 */
@Repository
public interface BonCarburantRepository extends JpaRepository<BonCarburant, Long> {

    public BonCarburant findByReference(String reference);

    public BonCarburant findByNumbonC(String reference);

}
