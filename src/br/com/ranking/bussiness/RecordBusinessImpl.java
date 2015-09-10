package br.com.ranking.bussiness;

import br.com.ranking.model.Match;
import br.com.ranking.match.MatchParser;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecordBusinessImpl implements RecordBusiness {
    
    @Override
    public void process(String path) {
        File filePath = new File(path);
        
        if (!filePath.exists()) {
                throw new IllegalArgumentException("O caminho não existe!");
        }
        
        if (!filePath.getName().endsWith(".txt")) {
            throw new IllegalArgumentException("O arquivo de log deve ter a extenção .txt");
        }
        
        List<Match> match = new ArrayList<Match>();
        match = MatchParser.ProcessaPartida(filePath);
    }
}
