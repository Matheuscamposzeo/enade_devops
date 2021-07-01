/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.resources;

import com.ces.enade.dao.TipoQuestaoDAO;
import com.ces.enade.model.TipoQuestao;
import javax.ws.rs.Path;

/**
 *
 * @author mathe
 */
@Path("tipoquestao")
public class TipoQuestaoResource extends GenericResource<TipoQuestao, TipoQuestaoDAO> {

    public TipoQuestaoResource() {
        super(TipoQuestaoDAO.class);
    }

}
