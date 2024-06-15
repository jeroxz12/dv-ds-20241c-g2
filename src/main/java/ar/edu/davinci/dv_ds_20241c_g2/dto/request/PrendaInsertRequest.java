package ar.edu.davinci.dv_ds_20241c_g2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrendaInsertRequest {
    private String descripcion;
    private String tipo;
    private BigDecimal precioBase;
}


