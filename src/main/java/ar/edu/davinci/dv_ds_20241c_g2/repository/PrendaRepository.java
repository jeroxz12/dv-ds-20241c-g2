package ar.edu.davinci.dv_ds_20241c_g2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.edu.davinci.dv_ds_20241c_g2.domain.Prenda;
@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Long> {
}
