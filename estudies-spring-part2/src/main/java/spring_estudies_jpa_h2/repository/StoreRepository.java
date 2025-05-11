package spring_estudies_jpa_h2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring_estudies_jpa_h2.model.Store;

import java.util.List;

public interface  StoreRepository extends JpaRepository<Store,Long> {


}
