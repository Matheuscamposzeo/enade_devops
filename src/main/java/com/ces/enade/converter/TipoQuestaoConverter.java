/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.enade.converter;

import com.ces.enade.model.TipoQuestao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

/**
 *
 * @author mathe
 */
@FacesConverter("tipoquestaoConverter")
@Named
public class TipoQuestaoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && !value.isEmpty()) {
            return uic.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        if (value instanceof TipoQuestao) {
            TipoQuestao obj = (TipoQuestao) value;
            if (obj != null) {
                uic.getAttributes().put(obj.getIdTipoQuestao().toString(), obj);
                return obj.getIdTipoQuestao().toString();
            }
            return "";
        }
        return "";
    }

}
