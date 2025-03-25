// Anotaciones basicas de Spring
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Validacion
import javax.validation.Valid;

// DTOs locales
import dto.OperacionDTO;
import dto.ResultadoDTO;

// Servicio
import service.CalculadoraService;
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