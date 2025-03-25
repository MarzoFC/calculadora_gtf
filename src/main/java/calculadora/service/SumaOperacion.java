package service;

import org.springframework.stereotype.Service;

import service.Operacion;

@Service
public class SumaOperacion implements Operacion {
    
    @Override
    public String getNombreOperacion() {
        return "sumar";
    }
    
    @Override
    public double ejecutar(double numero1, double numero2) {
        return numero1 + numero2;
    }
}