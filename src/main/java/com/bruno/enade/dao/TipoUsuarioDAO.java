/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.dao;

import com.bruno.enade.model.TipoUsuario;

/**
 *
 * @author bruno
 */
public class TipoUsuarioDAO extends GenericDAO<TipoUsuario, Integer> {

    public TipoUsuarioDAO() {
        super(TipoUsuario.class);
    }

}
