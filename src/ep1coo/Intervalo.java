/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep1coo;

import java.time.LocalDateTime;

/**
 *
 * @author alexa
 */
public class Intervalo {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    
    public Intervalo(LocalDateTime inicio, LocalDateTime fim){
        this.inicio = inicio;
        this.fim = fim;
    }
    
    LocalDateTime getInicio(){
        return this.inicio;
    }
    
    LocalDateTime getFim(){
        return this.fim;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
    
}
