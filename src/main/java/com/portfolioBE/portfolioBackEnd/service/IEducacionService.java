/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion (Educacion educ);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion(Long id);
    
}
