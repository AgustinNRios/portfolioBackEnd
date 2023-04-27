/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.HardAndSoftSkill;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author agust
 */
public interface IHardAndSoftSkillService {
        
    public List<HardAndSoftSkill> listHardAndSoftSkill();
    
    public void createHardAndSoftSkill (HardAndSoftSkill hASS);
    
    public void deleteHardAndSoftSkill (Long id);
    
    public HardAndSoftSkill findHardAndSoftSkill(Long id);
    
    public Optional<HardAndSoftSkill> getHardAndSoftSkill(Long id);
    
}
