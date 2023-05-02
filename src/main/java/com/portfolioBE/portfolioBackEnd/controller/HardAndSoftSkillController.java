/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.controller;

import com.portfolioBE.portfolioBackEnd.model.HardAndSoftSkill;
import com.portfolioBE.portfolioBackEnd.service.IHardAndSoftSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author agust
 */
@RestController
@RequestMapping("hardAndSoftSkill")
@CrossOrigin(origins="https://portauthar528folio.web.app")
public class HardAndSoftSkillController {
    
    @Autowired
    private IHardAndSoftSkillService hASSService;
    
    @PostMapping("/new")
    public void addHardAndSoftSkill(@RequestBody HardAndSoftSkill hASS2)
    {
        hASSService.createHardAndSoftSkill(hASS2);
    }
    
    @GetMapping("/lista")
    @ResponseBody
    public List<HardAndSoftSkill> listaHardAndSoftSkill()
    {
        return hASSService.listHardAndSoftSkill();
    }
    
    @GetMapping("/get/{id}")
    public HardAndSoftSkill getHardAndSoftSkillById(@PathVariable("id")long id){
        
        HardAndSoftSkill hASS = hASSService.getHardAndSoftSkill(id).get();
        return hASS;
    }
        
    @DeleteMapping("/delete/{id}")
    public void deleteHardAndSoftSkill(@PathVariable Long id)
    {
        hASSService.deleteHardAndSoftSkill(id);
    }
    
    @PutMapping("/update/{id}")
    public void updateHardAndSoftSkill(@PathVariable("id") long id,@RequestBody HardAndSoftSkill hASS2){

        HardAndSoftSkill hASS = hASSService.findHardAndSoftSkill(id);
        
        hASS.setImg(hASS2.getImg());
        hASS.setArea(hASS2.getArea());
        hASS.setNombre(hASS2.getNombre());
        hASS.setNivel(hASS2.getNivel());
        hASS.setCategoria(hASS2.getCategoria());
        
        hASSService.createHardAndSoftSkill(hASS);
    }
    
}
