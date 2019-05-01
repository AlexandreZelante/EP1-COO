package reuniao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Reuniao {
    private ArrayList<Participante> participantes;
    private LocalDate dataMinima;
    private LocalDate dataMaxima;
    private ArrayList<Intervalo> interseccoes;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Reuniao(ArrayList<Participante> participantes, LocalDate dataMinima, LocalDate dataMaxima) {
        this.participantes = participantes;
        this.dataMinima = dataMinima;
        this.dataMaxima = dataMaxima;
        this.interseccoes = new ArrayList<>();
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public LocalDate getDataMinima() {
        return dataMinima;
    }

    public void setDataMinima(LocalDate dataMinima) {
        this.dataMinima = dataMinima;
    }

    public LocalDate getDataMaxima() {
        return dataMaxima;
    }

    public void setDataMaxima(LocalDate dataMaxima) {
        this.dataMaxima = dataMaxima;
    }


    public void mostraSobreposicao() {
        System.out.println("Lista de horários disponíveis por participante: \n");

        for (Participante participante : participantes) {
            ArrayList<Intervalo> disponibilidade = participante.getDisponibilidade();
            System.out.println("Participante: " + participante.getEmail());

            if (disponibilidade != null) {
                for (Intervalo intervalo : disponibilidade) {
                    System.out.println("De " + intervalo.getInicio().format(formatter) + " até " + intervalo.getFim().format(formatter));
                }
            }

            System.out.println("");
        }

        LocalDateTime inicio = dataMinima.atStartOfDay();
        LocalDateTime fim = dataMaxima.plusDays(1).atStartOfDay();

        buscaInterseccoes(0, inicio, fim);

        if (interseccoes != null) {
            System.out.println("\n\nLista de horários disponíveis para todos: \n");

            for (Intervalo interseccao : interseccoes) {
                System.out.println("De " + interseccao.getInicio().format(formatter) + " até " + interseccao.getFim().format(formatter));
            }
        } else {
            System.out.println("Não há um horário em que todos possam comparecer.");
        }
    }

    void buscaInterseccoes(int index, LocalDateTime inicio, LocalDateTime fim) {
        Participante participante = participantes.get(index);
        ArrayList<Intervalo> disponibilidade = participante.getDisponibilidade();
        LocalDateTime inicioPadrao = inicio;
        LocalDateTime fimPadrao = fim;

        for (Intervalo intervalo : disponibilidade) {
            if (intervalo.getInicio().isBefore(fim) && intervalo.getFim().isAfter(inicio)) {
                if (intervalo.getFim().isBefore(fim)) fim = intervalo.getFim();
                if (intervalo.getInicio().isAfter(inicio)) inicio = intervalo.getInicio();

                if ((participantes.size() - 1) != index) {
                    buscaInterseccoes(index+1, inicio, fim);
                } else {
                    interseccoes.add(new Intervalo(inicio, fim));
                }
            }

            inicio = inicioPadrao;
            fim = fimPadrao;
        }
    }
}
