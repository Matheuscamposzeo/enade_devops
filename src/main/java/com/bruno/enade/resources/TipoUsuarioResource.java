/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.resources;

import com.bruno.enade.dao.TipoUsuarioDAO;
import com.bruno.enade.model.TipoUsuario;
import javax.ws.rs.Path;

/**
 *
 * @author bruno
 */
@Path("tipousuario")
public class TipoUsuarioResource extends GenericResource<TipoUsuario, TipoUsuarioDAO> {

    public TipoUsuarioResource() {
        super(TipoUsuarioDAO.class);
    }

}
