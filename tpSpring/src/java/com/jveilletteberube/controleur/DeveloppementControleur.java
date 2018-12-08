/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jveilletteberube.controleur;

import com.jveilletteberube.model.Programmeur;
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
        List<Programmeur> liste = this.developpementService.getProgrammeursListe();
        model.addAttribute("bienvenue", "Bienvenue au service de catalogue de programmeurs");
        model.addAttribute("programmeurs", liste);
        return "home";
    }

    //@ResponseBody
    @RequestMapping(method = RequestMethod.GET, value="/profil", params={"u"})
    public String afficherProfil(@RequestParam("u") String courriel, ModelMap model) {
        Programmeur p = this.developpementService.getProgrammeur(courriel);
        if(p==null){ return "home"; }
        model.addAttribute("programmeur", p);
        return "profil";
    }
}
