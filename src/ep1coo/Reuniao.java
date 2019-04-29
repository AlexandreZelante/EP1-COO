package ep1coo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reuniao {
    private ArrayList<Participante> participantes;
    private ArrayList<Intervalo> listaInterseccoes;
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
       
        //Exibe os horários disponíveis inseridos pelos participantes
        for(Participante participante : participantes){
            ArrayList<Intervalo> listaDisponibilidade = participante.getDisponibilidade();
            System.out.println("Participante: " + participante.getEmail());
            if(listaDisponibilidade != null) {
                for(Intervalo intervalo : listaDisponibilidade){
                    System.out.println("De " + intervalo.getInicio() + " até " + intervalo.getFim());
                }
            }
            System.out.println("");
        }
        
        LocalDateTime iIntervalo = inicioIntervalo.atStartOfDay();
        LocalDateTime fIntervalo = finalIntervalo.atTime(23,59,59);
        
        defineInterseccoes(0, iIntervalo, fIntervalo);
        
        if(listaInterseccoes != null){
            for(Intervalo interseccao : listaInterseccoes){
                System.out.println(interseccao.getInicio() + " ate " + interseccao.getFim());
            }
        }else{
            System.out.println("Não há intersecções de horários");
        }
        
        
    }
    
    void defineInterseccoes(int index, LocalDateTime inicio, LocalDateTime fim){
        Participante participante = participantes.get(index);
        ArrayList<Intervalo> listaIntervalos = participante.getDisponibilidade();
        LocalDateTime inicioPadrao = inicio;
        LocalDateTime fimPadrao = fim;
        
        for(Intervalo iAtual : listaIntervalos){
            //Se houver uma interseccao
            if(iAtual.getInicio().isBefore(fim) && iAtual.getFim().isAfter(inicio)){
                if(iAtual.getFim().isBefore(fim)) fim = iAtual.getFim();
                if(iAtual.getInicio().isAfter(inicio)) inicio = iAtual.getInicio();
                //Caso a lista não esteja cheia
                if(participantes.size()-1 != index){
                    //Chama o método recursivamente enviando o proximo participante
                    defineInterseccoes(index+1, inicio, fim);
                }else{
                    listaInterseccoes.add(new Intervalo(inicio, fim));
                }
            }
            inicioPadrao = inicio;
            fimPadrao = fim;
        }
    }
    
}
