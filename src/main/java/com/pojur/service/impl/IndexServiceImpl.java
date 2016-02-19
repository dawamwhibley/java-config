/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojur.service.impl;

import com.pojur.entity.Tb1;
import com.pojur.repository.TB1Repository;
import com.pojur.service.IndexService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gaea
 */
@Service
public class IndexServiceImpl implements IndexService{
    
    @Autowired
    private TB1Repository b1Repository;
    
    @Override
    public String hello() {
        System.out.println("servce ");
        List<Tb1> list = b1Repository.tb1s();
        for (Tb1 tb1 : list) {
            System.out.println("+++ " + tb1.getIsi());
        }
        return "hello dunia";
    }
    
}
