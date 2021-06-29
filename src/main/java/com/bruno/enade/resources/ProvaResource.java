/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.resources;

import com.bruno.enade.dao.ProvaDAO;
import com.bruno.enade.model.Prova;
import javax.ws.rs.Path;

/**
 *
 * @author bruno
 */
@Path("prova")
public class ProvaResource extends GenericResource<Prova, ProvaDAO> {

    public ProvaResource() {
        super(ProvaDAO.class);
    }

}
