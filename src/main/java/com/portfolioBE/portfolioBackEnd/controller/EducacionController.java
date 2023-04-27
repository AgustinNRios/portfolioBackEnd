/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.controller;


import com.portfolioBE.portfolioBackEnd.service.IEducacionService;
import com.portfolioBE.portfolioBackEnd.model.Educacion;

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
@RequestMapping("educacion")
@CrossOrigin(origins="http://localhost:4200")
public class EducacionController {

    @Autowired
    private IEducacionService educServ;
    
    @PostMapping("/new")
    public void addEducacion(@RequestBody Educacion educ)
    {
        educServ.createEducacion(educ);
    }
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> listaEducacion()
    {
        return educServ.listEducacion();
    }
    
    @GetMapping("/get/{id}")
    public Educacion getEducacionById(@PathVariable("id")long id){
        
        Educacion educacion = educServ.getEducacion(id).get();
        return educacion;
    }
        
    @DeleteMapping("/delete/{id}")
    public void deleteEducacion(@PathVariable Long id)
    {
        educServ.deleteEducacion(id);
    }
    
    @PutMapping("/update/{id}")
    public void updateEducacion(@PathVariable("id") long id,@RequestBody Educacion educ){

        Educacion educacion = educServ.findEducacion(id);
        
        educacion.setImg(educ.getImg());
        educacion.setInstitucion(educ.getInstitucion());
        educacion.setTitulo(educ.getTitulo());
        educacion.setEstado(educ.getEstado());
        educacion.setDescripcion(educ.getDescripcion());
        
        educServ.createEducacion(educacion);
    }
    
}
