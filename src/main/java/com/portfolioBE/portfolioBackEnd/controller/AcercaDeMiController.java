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
/*@CrossOrigin(origins="https://portauthar528folio.web.app")*/
public class AcercaDeMiController {
    
    @Autowired
    private IAcercaDeMiService acercaDeMiService;
    
    @PostMapping("/new")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public void addAcercaDeMi(@RequestBody AcercaDeMi aDM)
    {
        acercaDeMiService.createAcercaDeMi(aDM);
    }
    
    @GetMapping("/lista")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    @ResponseBody
    public List<AcercaDeMi> listaAcercaDeMi()
    {
        return acercaDeMiService.listAcercaDeMi();
    }
    
    @GetMapping("/get/{id}")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public AcercaDeMi getAcercaDeMiById(@PathVariable("id")long id){
        
        AcercaDeMi aDM = acercaDeMiService.getAcercaDeMi(id).get();
        return aDM;
    }
        
    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public void deleteAcercaDeMi(@PathVariable Long id)
    {
        acercaDeMiService.deleteAcercaDeMi(id);
    }
    
    @PutMapping("/update/{id}")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public void updateAcercaDeMi(@PathVariable("id") long id,@RequestBody AcercaDeMi aDM){

        AcercaDeMi aDMS = acercaDeMiService.findAcercaDeMi(id);
        
        aDMS.setImg(aDM.getImg());
        aDMS.setTitulo(aDM.getTitulo());
        aDMS.setDescripcion(aDM.getDescripcion());
        
        acercaDeMiService.createAcercaDeMi(aDMS);
    }
    
}
