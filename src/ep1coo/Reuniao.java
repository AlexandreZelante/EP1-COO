package ep1coo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Reuniao {
    private ArrayList<Participante> participantes;
    private LocalDate inicioIntervalo;
    private LocalDate finalIntervalo;
    
    public Reuniao(ArrayList<Participante> participantes, LocalDate inicioIntervalo, LocalDate finalIntervalo){
        this.participantes = participantes;
        this.inicioIntervalo = inicioIntervalo;
        this.finalIntervalo = finalIntervalo;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public LocalDate getInicioIntervalo() {
        return inicioIntervalo;
    }

    public LocalDate getFinalIntervalo() {
        return finalIntervalo;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public void setInicioIntervalo(LocalDate inicioIntervalo) {
        this.inicioIntervalo = inicioIntervalo;
    }

    public void setFinalIntervalo(LocalDate finalIntervalo) {
        this.finalIntervalo = finalIntervalo;
    }

    public void mostraSobreposicao(){
       
        for(Participante participante : participantes){
            ArrayList<Intervalo> listaDisponibilidade = participante.getDisponibilidade();
            System.out.println(participante.getEmail());
            if(listaDisponibilidade != null) {
                for(Intervalo intervalo : listaDisponibilidade){
                    System.out.println("De " + intervalo.getInicio() + " até " + intervalo.getFim());
                }
            }
            System.out.println("");
        }
    }
    
}
