package ar.edu.davinci.dv_ds_20241c_g2.dto.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemResponse {

    private Long id;

    private Integer cantidad;

    private PrendaResponse prenda;

    private BigDecimal importe;
}
