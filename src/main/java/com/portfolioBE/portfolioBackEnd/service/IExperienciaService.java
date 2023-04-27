/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.Experiencia;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author agust
 */
public interface IExperienciaService {
        
    public List<Experiencia> listExperiencia();
    
    public void createExperiencia (Experiencia exp);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia findExperiencia(Long id);
    
    public Optional<Experiencia> getExperiencia(Long id);
    
}
