/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.resources;

import com.ces.enade.dao.TipoUsuarioDAO;
import com.ces.enade.model.TipoUsuario;
import javax.ws.rs.Path;

/**
 *
 * @author mathe
 */
@Path("tipousuario")
public class TipoUsuarioResource extends GenericResource<TipoUsuario, TipoUsuarioDAO> {

    public TipoUsuarioResource() {
        super(TipoUsuarioDAO.class);
    }

}
