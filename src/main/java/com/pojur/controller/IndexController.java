/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojur.controller;

import com.pojur.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Gaea
 */
@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex() {
        System.out.println();
        System.out.println();
        System.out.println("---> "+ indexService.hello());
        System.out.println();
        System.out.println();
        return "default";
    }
}
