package ep1coo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Participante {
    String email;
    ArrayList<Intervalo> disponibilidade;
    
    public Participante(String email){
        this.email = email;
        this.disponibilidade = new ArrayList<Intervalo>();
    }
    
    List<Intervalo> getDisponibilidade(){
        return this.disponibilidade;
    }
    
    void inserirDisponibilidade(LocalDateTime inicio, LocalDateTime fim){
        Intervalo novoIntervalo = new Intervalo(inicio, fim);
        disponibilidade.add(novoIntervalo);
    }
    
    
}
