/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep1coo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author alexa
 */
public class MarcadorDeReuniao {
    Reuniao novaReuniao;
    
    public void marcarReuniaoEntre(LocalDate dataInicial, LocalDate dataFinal, Collection<String> listaDeEmailsParticipantes){
        ArrayList<Participante> listaDeParticipantes = new ArrayList<Participante>();
        
        for(String email : listaDeEmailsParticipantes){
            listaDeParticipantes.add(new Participante(email));
        }
        
        novaReuniao = new Reuniao(listaDeParticipantes, dataInicial, dataFinal);
    }
    
   public void indicaDisponibilidade(String participante, LocalDateTime inicio, LocalDateTime fim){
       //Verificar num if se a data encaixa no intervalo de data definida pelo organizador
       ArrayList<Participante> listaDeParticipantes = novaReuniao.getParticipantes();
       //Adicionar uma busca para pegar o participante que possua o email recebido no parametro "participante"
       //Pegando uma variavel tipo Participante, usar o inicio e fim (dos parametros) no método inserirDisponibilidade();
   }
}
