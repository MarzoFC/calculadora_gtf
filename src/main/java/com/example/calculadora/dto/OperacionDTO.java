package main.java.com.example.calculadora.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OperacionDTO {
    @NotNull(message = "El primer numero es obligatorio")
    private Double numero1;
    
    @NotNull(message = "El segundo numero es obligatorio")
    private Double numero2;
    
    // Getters y Setters
    
    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
}