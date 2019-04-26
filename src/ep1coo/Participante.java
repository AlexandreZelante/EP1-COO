/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep1coo;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Participante {
    String email;
    List<Intervalo> disponibilidade;
    
    public Participante(String email){
        this.email = email;
    }
    
    List<Intervalo> getDisponibilidade(){
        return this.disponibilidade;
    }
       
}
