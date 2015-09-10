/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ranking.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Eliardo Araújo
 */
public class Match {
    
    private long idPartida;
    private Date dataInicio;
    private Date dataFim;
    private List<Player> listaJogadores;

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(long idPartida) {
        this.idPartida = idPartida;
    }

    public List<Player> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<Player> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
}
