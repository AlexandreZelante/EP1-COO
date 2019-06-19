package ep1coo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GerenciadorDeSalas {
    List<Sala> salas = new ArrayList<Sala>();
    Collection<Reserva> colecaoReserva = new ArrayList<Reserva>();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    void adicionaSalaChamada(String nome, int capacidadeMaxima, String descricao){
        Sala sala = new Sala(nome, capacidadeMaxima, descricao);
        salas.add(sala);
    }
    
    void removeSalaChamada(String nome){
        for(Sala sala : salas){
            if(nome.equals(sala.getNome())){
                salas.remove(sala);
                return;
            }
        }
    }
    
    List<Sala> listaDeSalas(){
        return salas;
    }
    
    void adicionaSala(Sala sala){
        salas.add(sala);
    }
    
    Reserva reservaSalaChamada(String nome, LocalDateTime inicio, LocalDateTime fim){
        Sala salaReserva = null;
        
        for(Sala sala : salas){
            if(nome.equals(sala.getNome())){
                salaReserva = sala;
                break;
            }
        }
        
        Reserva reserva = new Reserva(salaReserva, inicio, fim);
        colecaoReserva.add(reserva);
        return reserva;
    }
    
    void cancelaReserva(Reserva reserva){
        colecaoReserva.remove(reserva);
    }
    
    Collection<Reserva> reservasParaSala(){
        return colecaoReserva;
    }
    
    void imprimeReservasDaSala(Sala sala){
       int cont = 0;
       for(Reserva novaReserva : colecaoReserva){
           if(novaReserva.sala == sala){
               System.out.println("Inicio: " + novaReserva.inicio.format(formatter));
               System.out.println("Fim: " + novaReserva.fim.format(formatter));
               System.out.println();
               cont++;
           }
       }
       
       if(cont == 0){
           System.out.println("Não há reservas nessa sala!");
       }
    }
}


