/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.AcercaDeMi;
import com.portfolioBE.portfolioBackEnd.repository.AcercaDeMiRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author agust
 */
@Service
public class AcercaDeMiService implements IAcercaDeMiService{
    
    @Autowired
    public AcercaDeMiRepository acercaDeMiRepo;
    
    @Override
    public List<AcercaDeMi> listAcercaDeMi() {
        return acercaDeMiRepo.findAll();
    }
    
    @Override
    public Optional<AcercaDeMi> getAcercaDeMi(Long id){
        return acercaDeMiRepo.findById(id);
    }

    @Override
    public void createAcercaDeMi(AcercaDeMi aDM) {
        acercaDeMiRepo.save(aDM);
    }

    @Override
    public void deleteAcercaDeMi(Long id) {
        acercaDeMiRepo.deleteById(id);
    }

    @Override
    public AcercaDeMi findAcercaDeMi(Long id) {
        return acercaDeMiRepo.findById(id).orElse(null);
    }


}
