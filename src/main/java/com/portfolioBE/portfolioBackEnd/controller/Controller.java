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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
*/

@RestController
@RequestMapping("educacion")
@CrossOrigin(origins="http://localhost:4200")
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
    
    @PostMapping("/new")
    public void agregarEducacion(@RequestBody Educacion educ)
    {
        //listaEducacion.add(educ);
        educServ.crearEducacion(educ);
    }
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> verEducacion()
    {
        //return listaEducacion;
        return educServ.verEducacion();
        
    }
    
    @GetMapping("/get/{id}")
    public Educacion getById(@PathVariable("id")long id){
        /*if(!sEducacion.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }*/
        Educacion educacion = educServ.getOne(id).get();
        return educacion;
    }
        
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id)
    {
        educServ.borrarEducacion(id);
    }
    
    @PutMapping("/update/{id}")//ResponseEntity<?>
    public void update(@PathVariable("id") long id,@RequestBody Educacion educ){
        /*
        if(!educServ.existById(id))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);//new Mensaje("El id no existe") implementar mas adelante
        /*if(educServ.existByNombre(dtoExp.getInstitucion()) && educServ.getByNombreEducacion(dtoExp.getInstitucion()).get().getId() != id)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);//new Mensaje("esa experiencia ya existe") implementar mas adelante*/
        /*if(StringUtils.isBlank(dtoExp.getInstitucion()))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);*/ //new Mensaje("El nombre es obligatorio"),
        
        Educacion educacion = educServ.buscarEducacion(id);
        educacion.setInstitucion(educ.getInstitucion());
        educacion.setEstado(educ.getEstado());
        educacion.setImg(educ.getImg());
        educacion.setInstitucion(educ.getInstitucion());
        educacion.setTitulo(educ.getTitulo());
        
        
        educServ.crearEducacion(educacion);
        //return new ResponseEntity(HttpStatus.OK);//new Mensaje("Experiencia actualizada"),
    }
    
}
