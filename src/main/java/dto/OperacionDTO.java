public class OperacionDTO {
    @NotNull(message = "El primer numero es obligatorio")
    private Double numero1;
    
    @NotNull(message = "El segundo numero es obligatorio")
    private Double numero2;
    
    // Getters y Setters
}