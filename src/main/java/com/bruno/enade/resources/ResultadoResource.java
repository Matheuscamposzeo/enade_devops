/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.resources;

import com.bruno.enade.dao.ResultadoDAO;
import com.bruno.enade.model.Resultado;
import javax.ws.rs.Path;

/**
 *
 * @author bruno
 */
@Path("resultado")
public class ResultadoResource extends GenericResource<Resultado, ResultadoDAO> {

    public ResultadoResource() {
        super(ResultadoDAO.class);
    }

}
