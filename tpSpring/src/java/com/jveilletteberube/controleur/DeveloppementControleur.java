/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jveilletteberube.controleur;

import com.jveilletteberube.services.DeveloppementService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author admin
 */
@Controller
public class DeveloppementControleur {
    private DeveloppementService developpementService;

    public void setDeveloppementService(DeveloppementService developpementService) {
        this.developpementService = developpementService;
    }
    
    //@ResponseBody
    @RequestMapping("/")
    public String welcome(ModelMap model) {
        //List<String> liste = this.developpementService.getProgrammeursListe();
        model.addAttribute("bienvenue", "Bienvenue au service de catalogue de programmeurs");
        //model.addAttribute("programmeurs", liste);
        return "home";
    }

    //@ResponseBody
<<<<<<< HEAD
    @RequestMapping(method = RequestMethod.GET, value="/profil", params={"u"})
    public String afficherProfil(@RequestParam("u") String courriel, ModelMap model) {
        Programmeur p = this.developpementService.getProgrammeur(courriel);
        if(p==null){ return "home"; }
        model.addAttribute("programmeur", p);
        return "profil";
    }
<<<<<<< HEAD
    
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(ModelMap model) throws IOException
    {
        model.put("form", new Form());    
        return "add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public View create(HttpSession session, Form form, ModelMap model) throws IOException
    {
        Programmeur programmeur = new Programmeur();
        programmeur.setCourriel(form.getCourriel());
        programmeur.setNom(form.getNom());
        programmeur.setLangages(form.getLangages());
        this.developpementService.addProgrammeur(programmeur);

        return new RedirectView("/", true, false);
    }
    
    public static class Form {
        private String courriel = "";
        private String nom = "";
        private String langages = "";
        
        public String getCourriel(){
            return courriel;
        }
        
        public void setCourriel(String courriel){
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
=======
    /*@RequestMapping(method = RequestMethod.GET, value="/", params={"nom"})
    public String afficher(@RequestParam("nom") String nom, ModelMap model) {
        model.addAttribute("message", "1 "+nom+" vaut "+converterService.getTaux(nom)+" $CAN");
        return "convert";
    }*/
>>>>>>> parent of 12f8da0... Page de profil faite
=======
>>>>>>> parent of ade45fe... fusion manuelle d'ajout programmeur et backUp
}
