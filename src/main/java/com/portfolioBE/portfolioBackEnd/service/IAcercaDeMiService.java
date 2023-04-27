/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioBE.portfolioBackEnd.service;

import com.portfolioBE.portfolioBackEnd.model.AcercaDeMi;
import java.util.List;
import java.util.Optional;

public interface IAcercaDeMiService {
    
    public List<AcercaDeMi> listAcercaDeMi();
    
    public void createAcercaDeMi (AcercaDeMi aDM);
    
    public void deleteAcercaDeMi (Long id);
    
    public AcercaDeMi findAcercaDeMi(Long id);
    
    public Optional<AcercaDeMi> getAcercaDeMi(Long id);
    
}
