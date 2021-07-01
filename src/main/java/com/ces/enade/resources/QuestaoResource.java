/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.resources;

import com.ces.enade.dao.QuestaoDAO;
import com.ces.enade.model.Questao;
import javax.ws.rs.Path;

/**
 *
 * @author mathe
 */
@Path("questao")
public class QuestaoResource extends GenericResource<Questao, QuestaoDAO> {

    public QuestaoResource() {
        super(QuestaoDAO.class);
    }

}
