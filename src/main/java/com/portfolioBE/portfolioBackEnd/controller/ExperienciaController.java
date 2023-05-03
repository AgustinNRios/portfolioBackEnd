/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.controller;

import com.portfolioBE.portfolioBackEnd.model.Experiencia;
import com.portfolioBE.portfolioBackEnd.service.IExperienciaService;
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
@RequestMapping("experiencia")
/*@CrossOrigin(origins="https://portauthar528folio.web.app")*/
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/new")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public void addExperiencia(@RequestBody Experiencia exp)
    {
        expServ.createExperiencia(exp);
    }
    
    @GetMapping("/lista")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    @ResponseBody
    public List<Experiencia> listaExperiencia()
    {
        return expServ.listExperiencia();
    }
    
    @GetMapping("/get/{id}")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public Experiencia getExperienciaById(@PathVariable("id")long id){
        
        Experiencia experiencia = expServ.getExperiencia(id).get();
        return experiencia;
    }
        
    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public void borrarExperiencia(@PathVariable Long id)
    {
        expServ.deleteExperiencia(id);
    }
    
    @PutMapping("/update/{id}")
    @CrossOrigin(origins="https://portauthar528folio.web.app")
    public void updateExperiencia(@PathVariable("id") long id,@RequestBody Experiencia exp){

        Experiencia experiencia = expServ.findExperiencia(id);
        
        experiencia.setImg(exp.getImg());
        experiencia.setEmpresa(exp.getEmpresa());
        experiencia.setCargo(exp.getCargo());
        experiencia.setDescripcion(exp.getDescripcion());
        experiencia.setPeriodo(exp.getPeriodo());
        
        expServ.createExperiencia(experiencia);
    }
    
}
