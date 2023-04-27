/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.Experiencia;
import com.portfolioBE.portfolioBackEnd.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author agust
 */
@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> listExperiencia() {
        return expRepo.findAll();
    }
    
    @Override
    public Optional<Experiencia> getExperiencia(Long id){
        return expRepo.findById(id);
    }

    @Override
    public void createExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }


}
