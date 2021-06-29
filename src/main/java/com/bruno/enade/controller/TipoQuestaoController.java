/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.controller;

import com.bruno.enade.dao.FactoryDAO;
import com.bruno.enade.dao.TipoQuestaoDAO;
import com.bruno.enade.model.TipoQuestao;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author bruno
 */
@Named
@SessionScoped
public class TipoQuestaoController implements Serializable {

    private final FactoryDAO factoryDAO = new FactoryDAO();
    private final Class<TipoQuestaoDAO> daoClass;

    TipoQuestao tipoQuestao = new TipoQuestao();
    List<TipoQuestao> tipoQuestoes = new ArrayList<>();

    public TipoQuestaoController() {
        daoClass = TipoQuestaoDAO.class;
        tipoQuestoes = factoryDAO.getInstance(daoClass).findAll();
        tipoQuestao = new TipoQuestao();
    }

    public void gravar(ActionEvent actionEvent) {
        factoryDAO.getInstance(daoClass).merge(tipoQuestao);
        tipoQuestoes = factoryDAO.getInstance(daoClass).findAll();
        tipoQuestao = new TipoQuestao();
    }

    public void remover(ActionEvent actionEvent) {
        factoryDAO.getInstance(daoClass).remove(tipoQuestao.getIdTipoQuestao());
        tipoQuestoes = factoryDAO.getInstance(daoClass).findAll();
        tipoQuestao = new TipoQuestao();
    }

    public void onRowEdit(RowEditEvent event) {
        TipoQuestao obj = (TipoQuestao) event.getObject();
        setTipoQuestao(obj);
        gravar(null);
        FacesMessage msg = new FacesMessage("Editado", obj.toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent<TipoQuestao> event) {
        FacesMessage msg = new FacesMessage("Cancelado", event.getObject().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public TipoQuestao getTipoQuestao() {
        return tipoQuestao;
    }

    public void setTipoQuestao(TipoQuestao tipoQuestao) {
        this.tipoQuestao = tipoQuestao;
    }

    public List<TipoQuestao> getTipoQuestoes() {
        return tipoQuestoes;
    }

    public void setTipoQuestoes(List<TipoQuestao> tipoQuestoes) {
        this.tipoQuestoes = tipoQuestoes;
    }

}
