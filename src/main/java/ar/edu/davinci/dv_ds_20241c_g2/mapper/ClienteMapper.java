package ar.edu.davinci.dv_ds_20241c_g2.mapper;

import java.util.Collection;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ar.edu.davinci.dv_ds_20241c_g2.dto.request.ClienteInsertRequest;
import ar.edu.davinci.dv_ds_20241c_g2.dto.request.ClienteUpdateRequest;
import ar.edu.davinci.dv_ds_20241c_g2.dto.response.ClienteResponse;
import ar.edu.davinci.dv_ds_20241c_g2.domain.Cliente;
@Mapper
public interface ClienteMapper {
    ClienteMapper instance = Mappers.getMapper(ClienteMapper.class);
    ClienteResponse mapToClienteResponse(Cliente cliente);
    Cliente matToCliente(ClienteInsertRequest clienteDto);
    Cliente matToCliente(ClienteUpdateRequest clienteDto);
    List<ClienteResponse> matToListClienteResponse(Collection<Cliente> clientes);
}
