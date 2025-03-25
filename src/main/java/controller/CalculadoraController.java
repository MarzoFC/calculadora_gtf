// Anotaciones básicas de Spring
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Validación (Spring Boot 2.x usa javax.validation)
import javax.validation.Valid;

// DTOs locales
import com.example.calculadora.dto.OperacionDTO;
import com.example.calculadora.dto.ResultadoDTO;

// Servicio
import com.example.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    
    private final CalculadoraService calculadoraService;
    
    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    
    @PostMapping("/sumar")
    public ResponseEntity<ResultadoDTO> sumar(@Valid @RequestBody OperacionDTO operacionDTO) {
        double resultado = calculadoraService.sumar(operacionDTO.getNumero1(), operacionDTO.getNumero2());
        return ResponseEntity.ok(new ResultadoDTO(resultado));
    }
    
    @PostMapping("/restar")
    public ResponseEntity<ResultadoDTO> restar(@Valid @RequestBody OperacionDTO operacionDTO) {
        double resultado = calculadoraService.restar(operacionDTO.getNumero1(), operacionDTO.getNumero2());
        return ResponseEntity.ok(new ResultadoDTO(resultado));
    }
}