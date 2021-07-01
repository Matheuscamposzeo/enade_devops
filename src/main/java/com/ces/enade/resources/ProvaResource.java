/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.resources;

import com.ces.enade.dao.ProvaDAO;
import com.ces.enade.model.Prova;
import javax.ws.rs.Path;

/**
 *
 * @author mathe
 */
@Path("prova")
public class ProvaResource extends GenericResource<Prova, ProvaDAO> {

    public ProvaResource() {
        super(ProvaDAO.class);
    }

}
