/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jveilletteberube.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public abstract class SqlDao<T> {
    protected Connection cnx;
    public SqlDao(Connection cnx) {
        this.cnx = cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void close() throws SQLException {
        this.cnx.close();
    }
    public boolean isClosed() throws SQLException {
        return (cnx==null || cnx.isClosed());
    }
    
    public abstract boolean create(T x);
    public abstract boolean delete(T x);
    public abstract boolean update(T x);
    public abstract T findByCourriel(String x);
    public abstract List<T> findAll();
}
