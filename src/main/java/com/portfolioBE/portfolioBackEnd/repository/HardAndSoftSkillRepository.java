/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.repository;

import com.portfolioBE.portfolioBackEnd.model.HardAndSoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author agust
 */
@Repository
public interface HardAndSoftSkillRepository extends JpaRepository<HardAndSoftSkill, Long>{
    
}
