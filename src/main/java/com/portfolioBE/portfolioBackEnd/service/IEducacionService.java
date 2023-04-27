/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.Educacion;
import java.util.List;
import java.util.Optional;

public interface IEducacionService {
    
    public List<Educacion> listEducacion();
    
    public void createEducacion (Educacion exp);
    
    public void deleteEducacion (Long id);
    
    public Educacion findEducacion(Long id);
    
    public Optional<Educacion> getEducacion(Long id);
    
}
