package reuniao;

import java.time.LocalDateTime;

public class Intervalo {
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Intervalo(LocalDateTime inicio, LocalDateTime fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    LocalDateTime getInicio() {
        return this.inicio;
    }

    LocalDateTime getFim() {
        return this.fim;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
}
