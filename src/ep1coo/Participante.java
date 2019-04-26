/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep1coo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
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
    
    
}
