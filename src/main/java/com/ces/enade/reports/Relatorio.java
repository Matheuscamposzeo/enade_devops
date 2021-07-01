/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.reports;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author mathe
 */
public class Relatorio {

    private final String BASE_URL = "E:/Faculdade/9º período/Laboratório de Programação de Web Sites Dinâmicos/Enade/src/main/java/com/ces/enade/reports/";
    private final HttpServletResponse response;
    private final FacesContext context;
    private ByteArrayOutputStream baos;
    private Connection con;

    public Relatorio() {
        this.context = FacesContext.getCurrentInstance();
        this.response = (HttpServletResponse) context.getExternalContext().getResponse();
    }

    public void getRelatorio(String relatorio) {
        Map<String, Object> params = new HashMap<>();
        baos = new ByteArrayOutputStream();

        try {
            JasperReport report = JasperCompileManager.compileReport(BASE_URL + relatorio + ".jrxml");

            JasperPrint print = JasperFillManager.fillReport(report, params, getConexao());
            JasperExportManager.exportReportToPdfStream(print, baos);

            response.reset();
            response.setContentType("application/pdf");
            response.setContentLength(baos.size());
            response.setHeader("Content-disposition", "inline; filename=relatorio.pdf");
            response.getOutputStream().write(baos.toByteArray());
            response.getOutputStream().flush();
            response.getOutputStream().close();

            context.responseComplete();
            fecharConexao();

        } catch (JRException | IOException e) {
            Logger.getLogger(e.getMessage());
        }
    }

    public Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enade?autoReconnect=true&useSSL=false", "root", "root");
        } catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(e.getMessage());
        }
        return con;
    }

    public void fecharConexao() {
        try {
            con.close();
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
        }
    }

}
