package ep1coo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class MarcadorDeReuniao {
    Reuniao novaReuniao;
    
    public void marcarReuniaoEntre(LocalDate dataInicial, LocalDate dataFinal, Collection<String> listaDeEmailsParticipantes){
        ArrayList<Participante> listaDeParticipantes = new ArrayList<Participante>();
        
        for(String email : listaDeEmailsParticipantes){
            listaDeParticipantes.add(new Participante(email));
        }
        //Como vamos recuperar essa instancia? Na teoria o método deveria retornar a reunião
        //Para que no main pudessemos manipular ela, tipo chamar indica disponibilidade
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
