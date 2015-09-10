/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ranking.match;

import br.com.ranking.model.Player;
import br.com.ranking.model.Match;
import br.com.ranking.model.Record;
import br.com.ranking.util.DateTimeUtil;
import br.com.ranking.util.FileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Eliardo Araújo
 */
public class MatchParser {
    
    public static Pattern INICIA_PARTIDA = Pattern.compile("has started");
    public static Pattern TERMINA_PARTIDA = Pattern.compile("has ended");
    
    public static List<Match> ProcessaPartida(File filePath) {
        List<Match> listaPartidas = new ArrayList<Match>();
        List<Record> listaRegistros = new ArrayList<Record>();
        Match part = new Match();
        part.setListaJogadores(new ArrayList<Player>());
        
        listaRegistros = FileUtil.loadFile(filePath.getPath());
        
        for (Record reg : listaRegistros) {
            if (reg.getDescricao().indexOf(INICIA_PARTIDA.toString()) >= 0) {
                part.setIdPartida(Long.parseLong(reg.getDescricao().substring(32,40)));
                part.setDataInicio(DateTimeUtil.parse(reg.getDescricao().substring(0, 19)));
                listaPartidas.add(part);
            }

            else if (reg.getDescricao().indexOf(TERMINA_PARTIDA.toString()) >= 0) {
                part.setDataFim(DateTimeUtil.parse(reg.getDescricao().substring(0, 19)));
            }
            else {
                    Player jogador = new Player();
                    jogador.setUser(getUserPlayer(reg.getDescricao().substring(22, reg.getDescricao().length())));
                    part.getListaJogadores().add(jogador);
                }
        }
        
        for (Match parti : listaPartidas) {
            System.out.print(part.getDataInicio() + " " + part.getDataFim() + "\n");
            
            for (Player p : part.getListaJogadores()) {
                System.out.print(p.getUser() + " " + p.getWins() + " - " + p.getDefeats() + "\n");
            }
        }
        
        return listaPartidas;
    }
    
    public static String getUserPlayer(String texto) {
        String[] saida = texto.split(" ");
      return saida[0];
    }
}
