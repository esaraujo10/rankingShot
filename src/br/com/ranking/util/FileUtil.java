package br.com.ranking.util;

import br.com.ranking.model.Record;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {        
        public static List<Record> loadFile (String path) {
            StringBuilder sb = new StringBuilder();
            Scanner sc = null;
            
            List<Record> listaRegistros = new ArrayList<Record>();
            
            try {
                sc= new Scanner(new FileInputStream(path));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            while (sc.hasNext()) {
                sb = new StringBuilder();
                sb.append(sc.nextLine() + "\r\n");
                
                listaRegistros.add(new Record(sb.toString()));
            }
            
            return listaRegistros;
        }
}
