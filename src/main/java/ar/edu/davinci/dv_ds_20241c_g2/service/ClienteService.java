package ar.edu.davinci.dv_ds_20241c_g2.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ar.edu.davinci.dv_ds_20241c_g2.domain.Cliente;
import ar.edu.davinci.dv_ds_20241c_g2.exceptions.BusinessException;
public interface ClienteService {
    Cliente save(final Cliente cliente) throws BusinessException;
    Cliente update(final Cliente cliente) throws BusinessException;
    void delete(final Cliente cliente);
    void delete(final Long id);
    Cliente findById(final Long id) throws BusinessException;
    List<Cliente> list();
    Page<Cliente> list(Pageable pageable);
    long count();
}
