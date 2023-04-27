/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.controller;

import com.portfolioBE.portfolioBackEnd.service.IAcercaDeMiService;
import com.portfolioBE.portfolioBackEnd.model.AcercaDeMi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;



@RestController
@RequestMapping("acercaDeMi")
@CrossOrigin(origins="http://localhost:4200")
public class AcercaDeMiController {
    
    @Autowired
    private IAcercaDeMiService acercaDeMiService;
    
    @PostMapping("/new")
    public void addAcercaDeMi(@RequestBody AcercaDeMi aDM)
    {
        acercaDeMiService.createAcercaDeMi(aDM);
    }
    
    @GetMapping("/lista")
    @ResponseBody
    public List<AcercaDeMi> listaAcercaDeMi()
    {
        return acercaDeMiService.listAcercaDeMi();
    }
    
    @GetMapping("/get/{id}")
    public AcercaDeMi getAcercaDeMiById(@PathVariable("id")long id){
        
        AcercaDeMi aDM = acercaDeMiService.getAcercaDeMi(id).get();
        return aDM;
    }
        
    @DeleteMapping("/delete/{id}")
    public void deleteAcercaDeMi(@PathVariable Long id)
    {
        acercaDeMiService.deleteAcercaDeMi(id);
    }
    
    @PutMapping("/update/{id}")
    public void updateAcercaDeMi(@PathVariable("id") long id,@RequestBody AcercaDeMi aDM){

        AcercaDeMi aDMS = acercaDeMiService.findAcercaDeMi(id);
        
        aDMS.setImg(aDM.getImg());
        aDMS.setTitulo(aDM.getTitulo());
        aDMS.setDescripcion(aDM.getDescripcion());
        
        acercaDeMiService.createAcercaDeMi(aDMS);
    }
    
}
