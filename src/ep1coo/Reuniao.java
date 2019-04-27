package ep1coo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Reuniao {
    private ArrayList<Participante> participantes;
    private LocalDate inicioIntervalo;
    private LocalDate finalIntervalo;
    
    public Reuniao(ArrayList<Participante> participantes, LocalDate inicioIntervalo, LocalDate finalIntervalo){
        
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

    
    
}
