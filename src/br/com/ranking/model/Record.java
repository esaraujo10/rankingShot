/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ranking.model;

/**
 *
 * @author Eliardo Araújo
 */
public class Record {

    public Record(String descricao) {
        this.descricao = descricao;
    }
    
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
