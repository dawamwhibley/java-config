/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojur.repository;

import com.pojur.entity.Tb1;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gaea
 */
public interface TB1Repository extends JpaRepository<Tb1, Integer>{
    
    @Query("SELECT t FROM Tb1 t")
    public List<Tb1> tb1s();
    
}
