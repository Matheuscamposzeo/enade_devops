/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.dao;

import com.bruno.enade.model.Prova;
import java.util.Date;

/**
 *
 * @author bruno
 */
public class ProvaDAO extends GenericDAO<Prova, Integer> {

    public ProvaDAO() {
        super(Prova.class);
    }

    public Prova findUltimaProvaAtiva(Integer idAluno) {
        final String jpql = " SELECT p FROM Prova p "
                + " LEFT JOIN p.resultadoList r "
                + " WHERE p.dataProva >= :dataProva AND (r.usuarioidUsuario IS NULL OR r.usuarioidUsuario.idUsuario <> :idAluno)";
        return (Prova) findSingleResult(entityManager.createQuery(jpql)
                .setParameter("dataProva", new Date())
                .setParameter("idAluno", idAluno));
    }

}
