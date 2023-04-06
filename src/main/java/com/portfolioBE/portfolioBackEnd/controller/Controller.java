/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.controller;
import com.portfolioBE.portfolioBackEnd.model.Educacion;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
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
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return listaEducacion;
    }
    
}
