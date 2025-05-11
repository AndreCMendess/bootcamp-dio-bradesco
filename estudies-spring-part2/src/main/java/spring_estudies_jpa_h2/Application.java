package spring_estudies_jpa_h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring_estudies_jpa_h2.model.Order;
import spring_estudies_jpa_h2.model.Store;
import spring_estudies_jpa_h2.repository.OrderRepository;
import spring_estudies_jpa_h2.repository.StoreRepository;
import spring_estudies_jpa_h2.service.OrderService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Store s = new Store();
		s.setName("Loja 1");
		storeRepository.save(s);

		orderService.createOrder("Pedido 1",s.getId());


	}
}
