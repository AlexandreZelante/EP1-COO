package reuniao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Participante {
    String email;
    ArrayList<Intervalo> disponibilidade;

    public Participante(String email) {
        this.email = email;
        this.disponibilidade = new ArrayList<Intervalo>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    ArrayList<Intervalo> getDisponibilidade() {
        return this.disponibilidade;
    }

    void inserirDisponibilidade(LocalDateTime inicio, LocalDateTime fim) {
        Intervalo intervalo = new Intervalo(inicio, fim);
        disponibilidade.add(intervalo);
    }
}
