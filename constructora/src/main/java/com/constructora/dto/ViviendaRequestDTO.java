package com.constructora.dto;

import java.math.BigDecimal;

import com.constructora.enums.TipoVivienda;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ViviendaRequestDTO {
    
    @NotBlank(message = "El título es obligatorio")
    private String titulo;

    @NotNull(message = "El tipo es obligatorio")
    private TipoVivienda tipo;

    @NotNull(message = "El número de habitaciones es obligatorio")
    @Min(value = 1, message = "Debe haber al menos 1 habitación")
    private Integer habitaciones;

    @NotNull(message = "El número de baños es obligatorio")
    @Min(value = 1, message = "Debe haber al menos 1 baño")
    private Integer banos;

    @NotNull(message = "El área es obligatoria")
    @DecimalMin(value = "0.0", inclusive = false, message = "El área debe ser un valor positivo")
    private Double area;

    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.0", inclusive = false, message = "El precio debe ser un valor positivo")
    private BigDecimal precio;

    private String imagenUrl;

    @NotNull(message = "El estado de disponibilidad es obligatorio")
    private Boolean disponible;

    @NotNull(message = "El proyecto es obligatorio")
    private Long proyectoId;

}
