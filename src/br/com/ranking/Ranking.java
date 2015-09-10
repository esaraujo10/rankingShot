/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ranking;

import br.com.ranking.bussiness.RecordBusinessImpl;
import java.util.Scanner;

/**
 *
 * @author Eliardo Araújo
 */
public class Ranking {
    public static void main(String[] args) {  
        Scanner ler = new Scanner(System.in); 
        System.out.printf("Informe o nome de arquivo texto:\n"); 
        String nome = ler.nextLine(); 
        
        new RecordBusinessImpl().process(nome);
    }
}
