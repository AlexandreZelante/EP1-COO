package reuniao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class MarcadorDeReuniao {
    Reuniao reuniao;

    public void marcarReuniaoEntre(LocalDate inicio, LocalDate fim, Collection<String> emails) {
        ArrayList<Participante> participantes = new ArrayList<Participante>();

        for (String email : emails) {
            participantes.add(new Participante(email));
        }

        reuniao = new Reuniao(participantes, inicio, fim);
    }

    public void indicaDisponibilidade(String email, LocalDateTime inicio, LocalDateTime fim) {
        if (inicio.isAfter(fim)) {
            System.out.println("ERRO: O horário final deve ser posterior ao inicial.");
            return;
        }

        LocalDateTime dataMinima = reuniao.getDataMinima().atStartOfDay();
        LocalDateTime dataMaxima = reuniao.getDataMaxima().plusDays(1).atStartOfDay();

        if (inicio.isBefore(dataMinima) || fim.isAfter(dataMaxima)) {
            System.out.println("ERRO: Os horários devem estar dentro do prazo da reunião.");
            return;
        }

        ArrayList<Participante> participantes = reuniao.getParticipantes();
        Participante selecionado = null;

        for (Participante participante : participantes) {
            if (participante.email.equals(email)) {
                selecionado = participante;
                break;
            }
        }

        if (selecionado == null) {
            System.out.println("ERRO: Participante não encontrado na lista de convidados.");
            return;
        }

        selecionado.inserirDisponibilidade(inicio, fim);
    }

    public void mostraSobreposicao() {
        reuniao.mostraSobreposicao();
    }
}
