/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.dao;

import com.bruno.enade.model.Usuario;
import java.util.List;

/**
 *
 * @author bruno
 */
public class UsuarioDAO extends GenericDAO<Usuario, Integer> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public Usuario findByEmail(Usuario usuario) {
        return (Usuario) findSingleResult(entityManager.createNamedQuery("Usuario.findByEmail")
                .setParameter("email", usuario.getEmail()));
    }

    public Usuario logIn(Usuario usuario) {
        return (Usuario) findSingleResult(entityManager.createNamedQuery("Usuario.findByEmailAndSenha")
                .setParameter("email", usuario.getEmail())
                .setParameter("senha", usuario.getSenha()));
    }
    
    public List<Usuario> findAllAlunos() {
        return entityManager.createNamedQuery("Usuario.findAllAlunos").getResultList();
    }

}
