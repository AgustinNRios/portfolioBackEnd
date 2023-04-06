/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.model.service;

import com.portfolioBE.portfolioBackEnd.model.Educacion;
import com.portfolioBE.portfolioBackEnd.model.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById();
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educRepo.findById(id).orElse(null);
    }

}
