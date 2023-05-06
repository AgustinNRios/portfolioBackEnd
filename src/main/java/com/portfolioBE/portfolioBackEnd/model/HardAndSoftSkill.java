/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author agust
 */
@Getter @Setter
@Entity
public class HardAndSoftSkill {
    
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String area;
    private String nombre;
    private int nivel;
    private String categoria;
    
    //constructores
    public HardAndSoftSkill() {
        
    }
    
    public HardAndSoftSkill(Long id,
            String img,
            String area,
            String nombre,
            int nivel,
            String categoria){
        
        this.id = id;
        this.img = img;
        this.area = area;
        this.nombre = nombre;
        this.nivel = nivel;
        this.categoria = categoria; 
    }
    
}
