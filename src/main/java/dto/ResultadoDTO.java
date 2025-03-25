package dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


public class ResultadoDTO {
    private double resultado;
    
    public ResultadoDTO(double resultado) {
        this.resultado = resultado;
    }
    
    public double getResultado() {
        return resultado;
    }
    
}