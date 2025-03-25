package main.java.com.example.calculadora.service;

public interface Operacion {
    String getNombreOperacion();
    double ejecutar(double numero1, double numero2);
}