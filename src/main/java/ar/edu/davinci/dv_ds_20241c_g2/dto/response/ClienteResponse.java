package ar.edu.davinci.dv_ds_20241c_g2.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteResponse {

    private Long id;

    private String nombre;

    private String apellido;

}
