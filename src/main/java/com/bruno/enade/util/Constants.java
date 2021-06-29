/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bruno.enade.util;

/**
 *
 * @author bruno
 */
public final class Constants {

    public static final String REGISTRO_SALVO = "Registro salvo com sucesso!";
    public static final String REGISTRO_NAO_ENCONTRADO = "Registro não encontrado!";
    public static final String REGISTRO_EXCLUIDO = "Registro excluído com sucesso!";
    public static final String TODOS_REGISTROS_EXCLUIDOS = "Todos os registros foram excluídos com sucesso!";
    public static final String ERRO_SALVAR_REGISTRO = "Erro ao salvar um registro! ";
    public static final String ERRO_EXCLUIR_REGISTRO = "Erro ao excluir o registro! ";
    
    public static final String URL_INDEX = "/index?faces-redirect=true";
    public static final String URL_LOGIN = "/login?faces-redirect=true";
    public static final String URL_RESULTADOS = "/resultados?faces-redirect=true";
    
    public static final String HTTP_SESSION_ATRIBUTE_LOGADO = "usuario";
     
    private Constants() {
    }

}
