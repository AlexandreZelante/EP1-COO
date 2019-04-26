/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep1coo;

import java.time.LocalDate;
import java.util.Collection;

/**
 *
 * @author alexa
 */
public class Reuniao {
    private Collection<String> participantes;
    private LocalDate inicioIntervalo;
    private LocalDate finalIntervalo;
    
    public Reuniao(Collection<String> participantes, LocalDate inicioIntervalo, LocalDate finalIntervalo){
        this.participantes = participantes;
        this.inicioIntervalo = inicioIntervalo;
        this.finalIntervalo = finalIntervalo;
    }

    public void setParticipantes(Collection<String> participantes) {
        this.participantes = participantes;
    }

    public void setInicioIntervalo(LocalDate inicioIntervalo) {
        this.inicioIntervalo = inicioIntervalo;
    }

    public void setFinalIntervalo(LocalDate finalIntervalo) {
        this.finalIntervalo = finalIntervalo;
    }

    public Collection<String> getParticipantes() {
        return participantes;
    }

    public LocalDate getInicioIntervalo() {
        return inicioIntervalo;
    }

    public LocalDate getFinalIntervalo() {
        return finalIntervalo;
    }
    
}
