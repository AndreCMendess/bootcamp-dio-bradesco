package estudies_spring2.app;

import estudies_spring2.app.model.Order;
import estudies_spring2.app.model.Store;
import estudies_spring2.app.repository.OrderRepository;
import estudies_spring2.app.repository.StoreRepository;
import estudies_spring2.app.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrderServiceTest {


    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private StoreRepository storeRepository;

    @Test
    @Transactional
    public void testCreateOrder() {
        // Dados de entrada para o teste
        Store store = new Store();
        store.setName("Loja Teste");
        storeRepository.save(store);  // Salvando loja no banco

        String description = "Pedido de Teste";


        orderService.createOrder(description, store.getId());

        // Verificando se o pedido foi salvo
        Order savedOrder = orderRepository.findByStore(store).get(0);  // Assume que retorna a lista de pedidos por loja
        assertNotNull(savedOrder);
        assertEquals(description, savedOrder.getDescription());
        assertEquals(store.getId(), savedOrder.getStore().getId());
    }
}
