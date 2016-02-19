/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojur.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

/**
 *
 * @author Gaea
 */
@EnableWebMvc
@Configuration
//@ComponentScan({"com.pojur.config", "com.pojur.controller"})
@ComponentScan("com.pojur.controller")
//@ComponentScan(basePackages = {"com.pojur"})
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    
    @Bean
    public UrlBasedViewResolver viewResolver(){
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(TilesView.class);
        return viewResolver;
    }
    
    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{
            "/WEB-INF/tiles/index.xml"
        });
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }
    
}
