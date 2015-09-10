/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ranking.rules;

import br.com.ranking.model.Player;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eliardo Araújo
 */
public class PlayerRules {
    public static Map<String, Player> processPlayers(String record) {
        Map<String, Player> players = new HashMap<String, Player>();
            String[] text = record.split(" ");
            String regexUser = text[1].trim();
            Player player = null;
            player = new Player(regexUser.toString());
            
            players.put(regexUser, player);
        return players;
    }
}
