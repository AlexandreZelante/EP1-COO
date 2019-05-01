package ep;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Testes {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
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

        //assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        //assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, 1, "0 x 0 must be 0");
    }
}
