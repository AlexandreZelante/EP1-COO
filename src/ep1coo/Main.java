package ep1coo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        //Código teste para entender o fluxo de dados do programa
        
        Collection<String> participantes = new ArrayList<String>();
        
        participantes.add("um");
        participantes.add("dois");
        participantes.add("tres");
        participantes.add("quatro");
        
        MarcadorDeReuniao marcador = new MarcadorDeReuniao();
        marcador.marcarReuniaoEntre(LocalDate.parse("2019-04-29"), LocalDate.parse("2019-05-05"), participantes);
        
        marcador.indicaDisponibilidade("um", LocalDateTime.parse("2019-04-29T11:40"), LocalDateTime.parse("2019-04-29T11:50"));
        marcador.indicaDisponibilidade("um", LocalDateTime.parse("2019-04-30T12:40"), LocalDateTime.parse("2019-04-30T12:50"));
        marcador.indicaDisponibilidade("dois", LocalDateTime.parse("2019-04-29T11:40"), LocalDateTime.parse("2019-04-29T11:50"));
        marcador.indicaDisponibilidade("dois", LocalDateTime.parse("2019-04-30T12:40"), LocalDateTime.parse("2019-04-30T12:50"));
        
 
        marcador.novaReuniao.mostraSobreposicao();
    }
    
}
