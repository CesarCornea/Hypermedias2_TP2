/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jveilletteberube.model;

/**
 *
 * @author admin
 */
public class Programmeur {
    private String courriel;
    private String nom;
    private String langages;

    public Programmeur(){}
    
    public Programmeur(String courriel, String nom, String langages){
        this.courriel = courriel; this.nom = nom; this.langages = langages;
    }
    
    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLangages() {
        return langages;
    }

    public void setLangages(String langages) {
        this.langages = langages;
    }
}
