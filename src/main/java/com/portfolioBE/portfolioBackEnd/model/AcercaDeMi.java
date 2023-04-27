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
public class AcercaDeMi {
    
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String titulo;
    private String descripcion;
    
    //constructores
    public AcercaDeMi() {
        
    }
    
    public AcercaDeMi(Long id,
            String img,
            String titulo,
            String descripcion){
        
        this.id = id;
        this.img = img;
        this.titulo = titulo;
        this.descripcion = descripcion; 
    }
    
}
