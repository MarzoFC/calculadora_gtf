@Service
public class RestaOperacion implements Operacion {
    
    @Override
    public String getNombreOperacion() {
        return "restar";
    }
    
    @Override
    public double ejecutar(double numero1, double numero2) {
        return numero1 - numero2;
    }
}