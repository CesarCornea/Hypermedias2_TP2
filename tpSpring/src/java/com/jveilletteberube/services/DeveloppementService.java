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
    
    
    /*public double getTaux(String monnaie) {
        double taux = dao.findById(monnaie).getValeur();
        return taux;
    }*/

    public List<String> getProgrammeursListe() {
        List<String> liste = new LinkedList<>();
        ListIterator<Programmeur> iterateur = dao.findAll().listIterator();
        
        while (iterateur.hasNext())
            liste.add(iterateur.next().getNom());        
        return liste;
    }
}
