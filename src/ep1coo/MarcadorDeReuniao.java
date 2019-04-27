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
       // Codar aqui
       
       ArrayList<Participante> listaDeParticipantes = novaReuniao.getParticipantes();
       //Adicionar uma busca para pegar o participante que possua o email recebido no parametro "participante"
       Participante participanteSelecionado = null;
       for(Participante part : listaDeParticipantes){
           if(part.email.equals(participante)){
               //Participante encontrado
               participanteSelecionado = part;
               break;
           }
       }
       if(participanteSelecionado != null){
           //Participante existe -- Inclui um intervalo disponível dele
           participanteSelecionado.inserirDisponibilidade(inicio, fim);
           System.out.println("Intervalo inserido");
       }else{
           System.out.println("Participante não encontrado na lista da reunião");
       }
   }
}
