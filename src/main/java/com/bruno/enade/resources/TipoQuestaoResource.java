/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.resources;

import com.bruno.enade.dao.TipoQuestaoDAO;
import com.bruno.enade.model.TipoQuestao;
import javax.ws.rs.Path;

/**
 *
 * @author bruno
 */
@Path("tipoquestao")
public class TipoQuestaoResource extends GenericResource<TipoQuestao, TipoQuestaoDAO> {

    public TipoQuestaoResource() {
        super(TipoQuestaoDAO.class);
    }

}
