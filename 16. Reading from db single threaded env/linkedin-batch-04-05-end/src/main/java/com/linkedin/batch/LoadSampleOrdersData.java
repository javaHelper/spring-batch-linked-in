package com.linkedin.batch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.LongStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;


@SpringBootApplication
public class LoadSampleOrdersData implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(LoadSampleOrdersData.class, args);
	}
	
	private Faker faker = Faker.instance();
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Order> orders = new ArrayList<>();
		
		LongStream.range(1, 1000)
			.forEach(index -> {
				Order order = Order.builder()
						.orderId(index)
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.email(faker.name().firstName()+"."+faker.name().lastName()+"@gmail.com")
						.cost(new BigDecimal(ThreadLocalRandom.current().nextDouble(100.0, 999.9)))
						.itemId(String.valueOf(index))
						.itemName(faker.commerce().productName())
						.shipDate(new Date())
						.build();
				orders.add(order);
			});
		
		orderRepository.saveAll(orders);
	}
}
