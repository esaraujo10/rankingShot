/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ranking.model;

/**
 *
 * @author Eliardo Araújo
 */
public class Player implements Comparable<Player> {
    private String user;
    private Wins wins;
    private Defeats defeats;

    public Player() {
    }

    public Player(String user) {
        this.user = user;
    }

    public Defeats getDefeats() {
        return defeats;
    }

    public void setDefeats(Defeats defeats) {
        this.defeats = defeats;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Wins getWins() {
        return wins;
    }

    public void setWins(Wins wins) {
        this.wins = wins;
    }
    
    @Override
    public int compareTo(Player other) {
        return this.getUser().compareTo(other.getUser());
    }
}
