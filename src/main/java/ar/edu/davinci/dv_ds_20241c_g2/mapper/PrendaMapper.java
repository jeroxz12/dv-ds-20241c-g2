package ar.edu.davinci.dv_ds_20241c_g2.mapper;

import ar.edu.davinci.dv_ds_20241c_g2.domain.Prenda;
import ar.edu.davinci.dv_ds_20241c_g2.dto.request.PrendaInsertRequest;
import ar.edu.davinci.dv_ds_20241c_g2.dto.request.PrendaUpdateRequest;
import ar.edu.davinci.dv_ds_20241c_g2.dto.response.PrendaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ar.edu.davinci.dv_ds_20241c_g2.dto.request.PrendaInsertRequest;
import ar.edu.davinci.dv_ds_20241c_g2.dto.request.PrendaUpdateRequest;
import ar.edu.davinci.dv_ds_20241c_g2.dto.response.PrendaResponse;
import ar.edu.davinci.dv_ds_20241c_g2.domain.Prenda;
@Mapper
public interface PrendaMapper {
    PrendaMapper instance = Mappers.getMapper(PrendaMapper.class);
    PrendaResponse mapToPrendaResponse(Prenda prenda);
    Prenda mapToPrenda(PrendaInsertRequest prendaDto);
    Prenda mapToPrenda(PrendaUpdateRequest prendaDto);
}
