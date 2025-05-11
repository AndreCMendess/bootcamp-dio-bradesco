package spring_estudies_jpa_h2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spring_estudies_jpa_h2.model.Order;
import spring_estudies_jpa_h2.model.Store;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long>{

    List<Order> findByStore(Store store);

    @Query("SELECT o FROM Order o WHERE o.store = :store")
    List<Order> findOrdersByStore(@Param("store") Store store);
}
