package ep1coo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        //Código teste para entender o fluxo de dados do programa
        
        Collection<String> participantes = new ArrayList<String>();
        
        participantes.add("Paulo");
        participantes.add("Pedro");
        participantes.add("Ale");
        
        MarcadorDeReuniao marcador = new MarcadorDeReuniao();
        marcador.marcarReuniaoEntre(LocalDate.parse("2019-01-01"), LocalDate.parse("2019-01-10"), participantes);
        
        marcador.indicaDisponibilidade("Paulo", LocalDateTime.parse("2019-01-01T08:30"), LocalDateTime.parse("2019-01-01T10:00"));
        marcador.indicaDisponibilidade("Paulo", LocalDateTime.parse("2019-01-01T16:00"), LocalDateTime.parse("2019-01-01T18:00"));
        marcador.indicaDisponibilidade("Paulo", LocalDateTime.parse("2019-01-03T12:00"), LocalDateTime.parse("2019-01-03T16:00"));
        marcador.indicaDisponibilidade("Pedro", LocalDateTime.parse("2019-01-01T09:00"), LocalDateTime.parse("2019-01-01T17:00"));
        marcador.indicaDisponibilidade("Pedro", LocalDateTime.parse("2019-01-03T11:00"), LocalDateTime.parse("2019-01-03T13:00"));
        marcador.indicaDisponibilidade("Pedro", LocalDateTime.parse("2019-01-03T15:00"), LocalDateTime.parse("2019-01-03T17:00"));
        marcador.indicaDisponibilidade("Ale", LocalDateTime.parse("2019-01-02T01:00"), LocalDateTime.parse("2019-01-02T23:00"));
        marcador.indicaDisponibilidade("Ale", LocalDateTime.parse("2019-01-01T09:30"), LocalDateTime.parse("2019-01-01T16:30"));
        marcador.indicaDisponibilidade("Ale", LocalDateTime.parse("2019-01-03T12:30"), LocalDateTime.parse("2019-01-03T15:30"));
        
 
        marcador.novaReuniao.mostraSobreposicao();
    }
    
}
