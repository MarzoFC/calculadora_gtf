package main.java.com.example.calculadora.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.function.Function;

import main.java.com.example.calculadora.service.*;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {
    
    private final Map<String, Operacion> operaciones;
    
    @Autowired
    public CalculadoraServiceImpl(List<Operacion> operacionList) {
        operaciones = operacionList.stream()
            .collect(Collectors.toMap(
                Operacion::getNombreOperacion,
                Function.identity()
            ));
    }
    
    @Override
    public double sumar(double numero1, double numero2) {
        return operaciones.get("sumar").ejecutar(numero1, numero2);
    }
    
    @Override
    public double restar(double numero1, double numero2) {
        return operaciones.get("restar").ejecutar(numero1, numero2);
    }
}