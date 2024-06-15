package ar.edu.davinci.dv_ds_20241c_g2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.edu.davinci.dv_ds_20241c_g2.domain.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
