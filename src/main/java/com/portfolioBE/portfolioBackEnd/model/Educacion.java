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

@Getter @Setter
@Entity

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String institucion;
    private String titulo;
    private String estado;
    private String descripcion;
    
    //constructores
    public Educacion() {
        
    }
    
    public Educacion(Long id,
            String img,
            String institucion,
            String titulo,
            String estado,
            String descripcion){
        
        this.id = id;
        this.img = img;
        this.institucion = institucion;
        this.titulo = titulo;
        this.estado = estado;
        this.descripcion = descripcion; 
    }
    
    
}
