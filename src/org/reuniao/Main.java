package reuniao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Código de teste
        Collection<String> listaDeParticipantes = new ArrayList<String>();

        listaDeParticipantes.add("alexandre.zelante@usp.br");
        listaDeParticipantes.add("igor.antun@usp.br");

        MarcadorDeReuniao marcador = new MarcadorDeReuniao();
        marcador.marcarReuniaoEntre(LocalDate.parse("2019-01-07"), LocalDate.parse("2019-01-10"), listaDeParticipantes);

        marcador.indicaDisponibilidade("alexandre.zelante@usp.br", LocalDateTime.parse("2019-01-07T08:00"), LocalDateTime.parse("2019-01-07T12:00"));
        marcador.indicaDisponibilidade("alexandre.zelante@usp.br", LocalDateTime.parse("2019-01-08T08:00"), LocalDateTime.parse("2019-01-08T12:00"));
        marcador.indicaDisponibilidade("alexandre.zelante@usp.br", LocalDateTime.parse("2019-01-09T08:00"), LocalDateTime.parse("2019-01-09T12:00"));
        marcador.indicaDisponibilidade("igor.antun@usp.br", LocalDateTime.parse("2019-01-07T11:20"), LocalDateTime.parse("2019-01-07T11:59"));
        marcador.indicaDisponibilidade("igor.antun@usp.br", LocalDateTime.parse("2019-01-07T09:45"), LocalDateTime.parse("2019-01-07T10:15"));

        marcador.mostraSobreposicao();
    }
}
