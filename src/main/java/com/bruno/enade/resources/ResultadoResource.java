/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.resources;

import com.ces.enade.dao.ResultadoDAO;
import com.ces.enade.model.Resultado;
import javax.ws.rs.Path;

/**
 *
 * @author mathe
 */
@Path("resultado")
public class ResultadoResource extends GenericResource<Resultado, ResultadoDAO> {

    public ResultadoResource() {
        super(ResultadoDAO.class);
    }

}
