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
public class Experiencia {
    
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String empresa;
    private String cargo;
    private String periodo;
    private String descripcion;
    
    //constructores
    public Experiencia() {
        
    }
    
    public Experiencia(Long id,
            String img,
            String empresa,
            String cargo,
            String periodo,
            String descripcion){
        
        this.id = id;
        this.img = img;
        this.empresa = empresa;
        this.cargo = cargo;
        this.periodo = periodo;
        this.descripcion = descripcion; 
    }
    
    
}

