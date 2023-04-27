/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.Educacion;
import com.portfolioBE.portfolioBackEnd.repository.EducacionRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educRepo;
    
    @Override
    public List<Educacion> listEducacion() {
        return educRepo.findAll();
    }
    
    @Override
    public Optional<Educacion> getEducacion(Long id){
        return educRepo.findById(id);
    }

    @Override
    public void createEducacion(Educacion educ) {
        educRepo.save(educ);
    }

    @Override
    public void deleteEducacion(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        return educRepo.findById(id).orElse(null);
    }


}
