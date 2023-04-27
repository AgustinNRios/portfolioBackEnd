/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.HardAndSoftSkill;
import com.portfolioBE.portfolioBackEnd.repository.HardAndSoftSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author agust
 */
@Service
public class HardAndSoftSkillService implements IHardAndSoftSkillService{
    
    @Autowired
    public HardAndSoftSkillRepository hASSRepo;
    
    @Override
    public List<HardAndSoftSkill> listHardAndSoftSkill() {
        return hASSRepo.findAll();
    }
    
    @Override
    public Optional<HardAndSoftSkill> getHardAndSoftSkill(Long id){
        return hASSRepo.findById(id);
    }

    @Override
    public void createHardAndSoftSkill(HardAndSoftSkill hASS) {
        hASSRepo.save(hASS);
    }

    @Override
    public void deleteHardAndSoftSkill(Long id) {
        hASSRepo.deleteById(id);
    }

    @Override
    public HardAndSoftSkill findHardAndSoftSkill(Long id) {
        return hASSRepo.findById(id).orElse(null);
    }


}
