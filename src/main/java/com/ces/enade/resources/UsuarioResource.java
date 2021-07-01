/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.resources;

import com.ces.enade.dao.UsuarioDAO;
import com.ces.enade.model.Usuario;
import javax.ws.rs.Path;

/**
 *
 * @author mathe
 */
@Path("usuario")
public class UsuarioResource extends GenericResource<Usuario, UsuarioDAO> {

    public UsuarioResource() {
        super(UsuarioDAO.class);
    }

}
