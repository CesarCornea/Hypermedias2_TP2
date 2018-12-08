/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jveilletteberube.services;

import com.jveilletteberube.dao.DeveloppementDao;
import com.jveilletteberube.model.Programmeur;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author admin
 */
public class DeveloppementService {
    private DeveloppementDao dao;

    public void setDao(DeveloppementDao dao) {
        this.dao = dao;
    }
    
    public Programmeur getProgrammeur(String courriel){
        Programmeur p = dao.findByCourriel(courriel);
        return p;
    }
    
    public boolean addProgrammeur(Programmeur programmeur) {
        return dao.create(programmeur);
    }
    /*public double getTaux(String monnaie) {
        double taux = dao.findById(monnaie).getValeur();
        return taux;
    }*/

     public List<Programmeur> getProgrammeursListe() {
        List<Programmeur> liste = new LinkedList<>();
        ListIterator<Programmeur> iterateur = dao.findAll().listIterator();
        
        while (iterateur.hasNext())
            liste.add(iterateur.next());      
        return liste;
    }
}
