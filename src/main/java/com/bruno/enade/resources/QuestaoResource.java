/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.resources;

import com.bruno.enade.dao.QuestaoDAO;
import com.bruno.enade.model.Questao;
import javax.ws.rs.Path;

/**
 *
 * @author bruno
 */
@Path("questao")
public class QuestaoResource extends GenericResource<Questao, QuestaoDAO> {

    public QuestaoResource() {
        super(QuestaoDAO.class);
    }

}
