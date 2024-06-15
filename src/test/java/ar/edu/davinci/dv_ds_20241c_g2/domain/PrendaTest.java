package ar.edu.davinci.dv_ds_20241c_g2.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class PrendaTest {

    @Test
    void testBuilder() {
        // Given
        Long id = 1L;
        String descripcion = "Pantalon";
        TipoPrenda tipoPrenda = TipoPrenda.PANTALON;
        BigDecimal precio = new BigDecimal(100);
        // When
        Prenda prenda = Prenda.builder()
                .id(id)
                .descripcion(descripcion)
                .tipo(tipoPrenda)
                .precioBase(precio)
                .build();
        // Then
        assertNotNull(prenda);
        assertEquals(id, prenda.getId());
        assertEquals(descripcion, prenda.getDescripcion());
        assertEquals(tipoPrenda, prenda.getTipo());
        assertEquals(precio, prenda.getPrecioBase());
    }

}
