/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.controller;

import com.ces.enade.dao.FactoryDAO;
import com.ces.enade.dao.ProvaDAO;
import com.ces.enade.model.Prova;
import com.ces.enade.model.Questao;
import com.ces.enade.model.Resultado;
import com.ces.enade.model.Usuario;
import com.ces.enade.util.Constants;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mathe
 */
@Named
@SessionScoped
public class RealizarProvaController implements Serializable {

    private final ResultadoController resultadoController;
    private final FactoryDAO factoryDAO = new FactoryDAO();
    private final Class<ProvaDAO> daoClass;

    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    Prova prova = new Prova();

    public RealizarProvaController() {
        daoClass = ProvaDAO.class;
        resultadoController = new ResultadoController();
        prova = factoryDAO.getInstance(daoClass).findUltimaProvaAtiva(getUsuarioLogado().getIdUsuario());
    }

    public String finalizarProva() {
        double valorObtido = 0;
        double valorPorQuestao = 10.0 / prova.getQuestaoList().size();
        for (Questao questao : prova.getQuestaoList()) {
            String tipoQuestao = questao.getTipoQuestaoidTipoQuestao().getNomeTipoQuestao();
            if (tipoQuestao.equals("Discursiva") && !questao.getResposta().trim().equals("")) {
                valorObtido += valorPorQuestao;
            } else if (tipoQuestao.equals("Múltipla escolha") && questao.getQuestaoCorreta().toString().equals(questao.getResposta())) {
                valorObtido += valorPorQuestao;
            }
        }

        Resultado resultado = new Resultado();
        resultado.setProvaidProva(prova);
        resultado.setUsuarioidUsuario(getUsuarioLogado());
        resultado.setValorObtido(Math.round(valorObtido * 10.0) / 10.0);
        resultadoController.setResultado(resultado);
        resultadoController.gravar(null);
        return Constants.URL_RESULTADOS;
    }

    private Usuario getUsuarioLogado() {
        return (Usuario) session.getAttribute(Constants.HTTP_SESSION_ATRIBUTE_LOGADO);
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

}
