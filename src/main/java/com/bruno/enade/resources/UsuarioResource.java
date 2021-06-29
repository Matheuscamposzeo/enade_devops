/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.resources;

import com.bruno.enade.dao.UsuarioDAO;
import com.bruno.enade.model.Usuario;
import javax.ws.rs.Path;

/**
 *
 * @author bruno
 */
@Path("usuario")
public class UsuarioResource extends GenericResource<Usuario, UsuarioDAO> {

    public UsuarioResource() {
        super(UsuarioDAO.class);
    }

}
