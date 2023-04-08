/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.controller;

import com.portfolioBE.portfolioBackEnd.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.portfolioBE.portfolioBackEnd.model.Educacion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/*
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
*/

@RestController
public class Controller {

    /*
    List<Educacion> listaEducacion = new ArrayList();
    
    @GetMapping("/educacion")
    public String decirChau (@RequestParam Long id,
            @RequestParam String img,
            @RequestParam String institucion,
            @RequestParam String titulo,
            @RequestParam String estado,
            @RequestParam String descripcion)
    {
        return "id: "+id+" institucion: "+institucion;
    }
    
    @PostMapping("new/educacion")
    public void agregarEducacion(@RequestBody Educacion educ)
    {
        listaEducacion.add(educ);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion()
    {
        return listaEducacion;
    }
    */
    
    @Autowired
    private IEducacionService educServ;
        
    @PostMapping("new/educacion")
    public void agregarEducacion(@RequestBody Educacion educ)
    {
        //listaEducacion.add(educ);
        educServ.crearEducacion(educ);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion()
    {
        //return listaEducacion;
        return educServ.verEducacion();
        
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id)
    {
        educServ.borrarEducacion(id);
    }
    
}
