/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ces.test;

import com.ces.enade.model.TipoQuestao;
import com.ces.enade.resources.TipoQuestaoResource;
import com.ces.enade.util.Constants;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author mathe
 */
public class TipoQuestaoResourceTest {

    TipoQuestaoResource tipoQuestaoResource = mock(TipoQuestaoResource.class);
    List<TipoQuestao> tipoQuestaoList = new ArrayList<>();
    TipoQuestao tipoQuestao = mock(TipoQuestao.class);

    public TipoQuestaoResourceTest() {
    }

    @Test
    public void testFindAll() {
        tipoQuestaoList.add(tipoQuestao);
        when(tipoQuestaoResource.findAll()).thenReturn(tipoQuestaoList);
        assertEquals(tipoQuestaoList, tipoQuestaoResource.findAll());
    }

    @Test
    public void testFind() {
        when(tipoQuestaoResource.find(tipoQuestao.getIdTipoQuestao())).thenReturn(tipoQuestao);
        assertEquals(tipoQuestao, tipoQuestaoResource.find(tipoQuestao.getIdTipoQuestao()));
    }

    @Test
    public void testMerge() {
        when(tipoQuestaoResource.merge(tipoQuestao)).thenReturn(Constants.REGISTRO_SALVO);
        assertEquals(Constants.REGISTRO_SALVO, tipoQuestaoResource.merge(tipoQuestao));
    }

    @Test
    public void testRemoveAll() {
        when(tipoQuestaoResource.removeAll()).thenReturn(Constants.TODOS_REGISTROS_EXCLUIDOS);
        assertEquals(Constants.TODOS_REGISTROS_EXCLUIDOS, tipoQuestaoResource.removeAll());
    }

    @Test
    public void testRemove() {
        when(tipoQuestaoResource.remove(tipoQuestao.getIdTipoQuestao())).thenReturn(Constants.REGISTRO_EXCLUIDO);
        assertEquals(Constants.REGISTRO_EXCLUIDO, tipoQuestaoResource.remove(tipoQuestao.getIdTipoQuestao()));
    }

}
