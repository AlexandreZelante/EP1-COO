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
    
    ArrayList<Intervalo> getDisponibilidade(){
        return this.disponibilidade;
    }
    
    void inserirDisponibilidade(LocalDateTime inicio, LocalDateTime fim){
        Intervalo novoIntervalo = new Intervalo(inicio, fim);
        disponibilidade.add(novoIntervalo);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
