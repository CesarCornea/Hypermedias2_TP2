/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jveilletteberube.dao;

import com.jveilletteberube.model.Programmeur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DeveloppementDao extends SqlDao<Programmeur> {
    public DeveloppementDao() {
        super(null);
        String pilote = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/developpement?user=root&password=root";
        try {
            Class.forName(pilote);
            cnx = DriverManager.getConnection(url);
        }
        catch (Exception exp) {
            exp.printStackTrace();
        }
    }
    public DeveloppementDao(Connection cnx) {
        super(cnx);
    }    
    
    @Override
    public boolean create(Programmeur x) {
        try {
            PreparedStatement stm = cnx.prepareStatement("INSERT INTO programmeur (`COURRIEL`, `NOM`, `LANGAGES`) "
                                    + " VALUES (?, ?, ?)");
            stm.setString(1, x.getCourriel());
            stm.setString(2, x.getNom());
            stm.setString(3, x.getLangages());
            return stm.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
       
    @Override
    public Programmeur findByCourriel(String x) {
        Programmeur programmeur = null;
        try {
            PreparedStatement stm = cnx.prepareStatement("SELECT * FROM programmeur WHERE courriel=?");
            stm.setString(1, x);
            ResultSet res = stm.executeQuery();
            if (res.next()){
                programmeur = new Programmeur();
                programmeur.setCourriel(x);
                programmeur.setNom(res.getString("NOM"));
                programmeur.setLangages(res.getString("LANGAGES"));
            }
            else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return programmeur;
    }
    @Override
    public List<Programmeur> findAll() {
        List<Programmeur> liste = new LinkedList<>();
        Programmeur programmeur;
        try {
            PreparedStatement stm = cnx.prepareStatement("SELECT * FROM programmeur");
            ResultSet res = stm.executeQuery();
            while (res.next()){
                programmeur = new Programmeur();
                programmeur.setCourriel(res.getString("COURRIEL"));
                programmeur.setNom(res.getString("NOM"));
                programmeur.setLangages(res.getString("LANGAGES"));
                liste.add(programmeur);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }

    @Override
    public boolean delete(Programmeur x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Programmeur x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
